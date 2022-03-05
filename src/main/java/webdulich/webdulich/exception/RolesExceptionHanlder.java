package webdulich.webdulich.exception;

import org.springframework.http.HttpStatus;

public class RolesExceptionHanlder extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;


    public RolesExceptionHanlder(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
