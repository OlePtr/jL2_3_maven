package org.level.up.json;

public interface JsonDeserializer<T> {

    //String serialize(T object);
    T deserialize(String json);
}
