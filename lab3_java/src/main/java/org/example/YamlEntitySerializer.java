package org.example;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class YamlEntitySerializer<T> implements EntitySerializer<T> {
    private final Class<T> type;
    private final Yaml yaml;

    public YamlEntitySerializer(Class<T> type) {
        this.type = type;
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        this.yaml = new Yaml(options);
    }

    @Override
    public String serialize(T entity) {
        return yaml.dump(entity);
    }

    @Override
    public T deserialize(String data) {
        return yaml.loadAs(data, type);
    }

    @Override
    public void writeToFile(T entity, File file) throws IOException {
        Files.write(file.toPath(), serialize(entity).getBytes());
    }

    @Override
    public T readFromFile(File file) throws IOException {
        String content = new String(Files.readAllBytes(file.toPath()));
        return deserialize(content);
    }
}
