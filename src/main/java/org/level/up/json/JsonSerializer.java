package org.level.up.json;

public interface JsonSerializer<T> {

    String serialize(T object);

}
