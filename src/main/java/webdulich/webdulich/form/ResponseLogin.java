package webdulich.webdulich.form;

import org.springframework.http.HttpStatus;

public class ResponseLogin {
    String authKey;
    HttpStatus status;

    public ResponseLogin(String authKey, HttpStatus status) {
        this.authKey = authKey;
        this.status = status;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
