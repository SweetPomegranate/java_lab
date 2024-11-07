package org.example;

import java.io.File;
import java.io.IOException;
import jakarta.xml.bind.JAXBException;

public interface EntitySerializer<T> {
    String serialize(T entity) throws Exception;
    T deserialize(String data) throws Exception;
    void writeToFile(T entity, File file) throws Exception;
    T readFromFile(File file) throws JAXBException, IOException;
}
