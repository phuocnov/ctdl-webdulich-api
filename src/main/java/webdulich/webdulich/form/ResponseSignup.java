package webdulich.webdulich.form;

import java.time.LocalDate;

import webdulich.webdulich.customer.Customer;

public class ResponseSignup {
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;
    private String username;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ResponseSignup(String name, Integer age, LocalDate dob, String email, String username) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.username = username;
    }
    public ResponseSignup(Customer customer){
        this.name = customer.getName();
        this.age = customer.getAge();
        this.dob = customer.getDob();
        this.email = customer.getEmail();
        this.username = customer.getUsername();
    }
}
