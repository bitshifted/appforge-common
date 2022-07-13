package co.bitshifted.ignite.common.model;

public enum JvmVendor {

    OPENJDK("openjdk", "OpenJDK"),
    ADOPTIUM("adoptium", "Eclipse Adoptium");

    private final String code;
    private final String display;

     JvmVendor(String code, String display) {
        this.code = code;
        this.display = display;
    }

    public String getCode() {
        return code;
    }

    public String getDisplay() {
        return display;
    }
}
