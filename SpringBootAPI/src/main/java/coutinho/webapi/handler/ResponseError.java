package coutinho.webapi.handler;

import java.time.LocalDateTime;

public class ResponseError {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private String status;
    private int statusCode;
    private String error;


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getError() {
        return error;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setError(String error) {
        this.error = error;
    }
}
