package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonEntitySerializer<T> implements EntitySerializer<T> {
    private final Class<T> type;
    private final ObjectMapper objectMapper;

    public JsonEntitySerializer(Class<T> type) {
        this.type = type;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public String serialize(T entity) throws IOException {
        return objectMapper.writeValueAsString(entity);
    }

    @Override
    public T deserialize(String data) throws IOException {
        return objectMapper.readValue(data, type);
    }

    @Override
    public void writeToFile(T entity, File file) throws IOException {
        objectMapper.writeValue(file, entity);
    }

    @Override
    public T readFromFile(File file) throws IOException {
        return objectMapper.readValue(file, type);
    }
}
