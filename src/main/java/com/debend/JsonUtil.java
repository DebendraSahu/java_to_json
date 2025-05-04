package com.debend;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object obj) throws Exception {
        return mapper.writeValueAsString(obj);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        return mapper.readValue(json, clazz);
    }

    public static void toJsonFile(Object obj, File file) throws Exception {
        mapper.writeValue(file, obj);
    }

    public static <T> T fromJsonFile(File file, Class<T> clazz) throws Exception {
        return mapper.readValue(file, clazz);
    }

    public static <T> List<T> fromJsonToList(String json, Class<T> clazz) throws Exception {
        return mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, clazz));
    }

    public static <T> String listToJson(List<T> list) throws Exception {
        return mapper.writeValueAsString(list);
    }
}
