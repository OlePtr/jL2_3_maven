package org.level.up.json;

public @interface SerializedBy {
    Class<? extends JsonSerializer> serializer();
    Class<? extends JsonDeserializer> deserializer();
}
