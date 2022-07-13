package co.bitshifted.ignite.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum JavaVersion {

    JAVA_8("8"),
    JAVA_11("11"),
    JAVA_17("17");

    private final String display;

    JavaVersion(String display) {
        this.display = display;
    }

    @JsonValue
    public String getDisplay() {
        return display;
    }
}
