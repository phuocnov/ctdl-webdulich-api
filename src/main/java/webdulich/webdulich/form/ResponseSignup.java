package webdulich.webdulich.form;

import lombok.Getter;
import lombok.Setter;
import webdulich.webdulich.customer.Customer;

@Getter
@Setter
public class ResponseSignup {
    private String name;
    private String email;
    private String username;

    public ResponseSignup(String name, String email, String username) {
        this.name = name;
        this.email = email;
        this.username = username;
    }
    public ResponseSignup(Customer customer){
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.username = customer.getUsername();
    }
}
