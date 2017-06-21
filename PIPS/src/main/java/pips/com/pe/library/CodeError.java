package pips.com.pe.library;

/**
 * Created by desarrollo on 17/05/17.
 * @author mluyoe
 * @implNote when you need to send a custom response for errors
 */
public enum CodeError {
    /**
     * @implNote is used when a entity is duplicated
     * **/
    DUPLICATED(1000,"duplicated"),

    NO_EXIST(1001,"no_exist"),

    INVALID_PARAM(1002,"invalid_param");

    private final int value;

    private final String reasonPhrase;

    CodeError(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int getValue() {
        return value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }
}
