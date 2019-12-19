package com.api;

import android.util.Pair;
import com.android.volley.Request;
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

    static private String URL;


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


    public static <T> T launch(String url, TypeReference<T> type, Pair... pairs) {

        String urls = getUrl(url, pairs);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        AtomicReference<T> result = new AtomicReference<>();
        // Instantiate the RequestQueue.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, urls,
                response -> {
                    // Display the first 500 characters of the response string.
                    try {
                        result.set(mapper.readValue(response, type));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }, error -> {
            throw new RuntimeException(error);
        });

        return result.get();
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

}
