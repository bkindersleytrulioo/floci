package io.github.hectorvent.floci.core.common;

import java.util.Map;

public class ConditionalCheckFailedException extends AWSException {

    private final JsonNode item;

    public ConditionalCheckFailedException(JsonNode Item) {
        super("ConditionalCheckFailedException", "The conditional request failed", 400);
        this.item = Item;
    }

    public JsonNode getItem() {
        return item;
    }
}
