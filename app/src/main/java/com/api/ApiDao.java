package com.api;

import android.util.Pair;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class ApiDao {

    static private String URL = "http://localhost:8080/";


    private static String getUrl(String cmd, Pair... params) {

        AtomicReference<String> command = new AtomicReference<>();

        for (String pathVar : Arrays.asList(cmd.split("/"))) {
            try {
                command.set((command.get() != null ? command.get() + "/" : "") + URLEncoder.encode(pathVar, "UTF-8").replaceAll("\\+", "%20"));
            } catch (Exception e) {
                new RuntimeException("Fail to decode command " + cmd);
            }
        }

        StringBuilder url = new StringBuilder(URL + "/" + command.get());

        url = pairsParms(url, true, params);

        return url.toString();
    }


    private static StringBuilder pairsParms(StringBuilder url, boolean isFirst, Pair... params) {

        if (params != null) {
            for (Pair param : params) {
                if (isFirst) {
                    url.append("?");
                    isFirst = false;
                } else {
                    url.append("&");
                }
                url.append(param.first);
                if (param.second != null) {
                    try {
                        url.append("=").append(URLEncoder.encode(param.second.toString(), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return url;
    }


    public static <T> void launch(String url, TypeReference<T> type, ToDo todo,  Pair... pairs) {

        String urls = getUrl(url, pairs);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        // Instantiate the RequestQueue.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, urls, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                todo.doSome(mapper.readValue(json, template));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                throw new RuntimeException(e);
            }
        });


    }

    public interface ToDo<T>{
        public void doSome(T in);
    }

}
