package com.api;

import android.content.Context;
import android.util.Pair;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class ApiDao {
    private static RequestQueue queue;

    static private String URL = "http://10.0.2.2:8888";


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


    public static <T> void launch(String url, final TypeReference<T> type, final ToDo todo,Context lancher , Pair... pairs) {


        String urls = getUrl(url, pairs);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        // Instantiate the RequestQueue.

        queue = Volley.newRequestQueue(lancher);
        System.out.println("call " + urls);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, urls, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {

                    todo.doSome(mapper.readValue(response, type));


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                throw new RuntimeException(error);
            }
        });

        queue.add(stringRequest);

    }

    public interface ToDo<T>{
        public void doSome(T in);
    }

}
