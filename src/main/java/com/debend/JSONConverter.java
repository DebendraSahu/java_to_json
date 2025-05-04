package com.debend;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONConverter {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object obj) throws Exception {
        return mapper.writeValueAsString(obj);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        return mapper.readValue(json, clazz);
    }
}
