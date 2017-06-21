package pips.com.pe.library;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseJson {

    @JsonProperty("code")
    private int code;

    @JsonProperty("error")
    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public ResponseJson(String error){
        this.error = error;
    }

    public ResponseJson(int code, String error){
        this.code = code;
        this.error = error;
    }

    public ResponseJson(int code, String error, String errorDescription){
        this.code = code;
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
