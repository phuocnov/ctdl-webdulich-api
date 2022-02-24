package webdulich.webdulich.customer;

import org.springframework.http.HttpStatus;

public class CustomerAPIExeotion extends RuntimeException {
    private HttpStatus status;
    private String message;


    public CustomerAPIExeotion(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public CustomerAPIExeotion(HttpStatus status, String message, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return this.status;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
 
}
