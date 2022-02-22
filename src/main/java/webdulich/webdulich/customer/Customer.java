package webdulich.webdulich.customer;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "customer")
@Table
public class Customer {
    @Id
    @SequenceGenerator(
        name = "customer_sequence",
        sequenceName = "customer_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "customer_sequence"
    )
    private int ID;
    private String name;

    @Transient
    private Integer age;
    private LocalDate dob;
    private String email;
    private String username;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    private String pwd;

    public Customer(){
    }


    public Customer(int id, String name, LocalDate dob, String email, String username, String pwd) {
        this.ID = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.username = username;
        this.pwd = pwd;
    }
   
    public Customer(String name, Integer age, LocalDate dob, String email, String username, String pwd) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.username = username;
        this.pwd = pwd;
    }

    public int getId() {
        return this.ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
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

}
