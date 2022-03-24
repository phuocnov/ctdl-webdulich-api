package webdulich.webdulich.booking;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;

import webdulich.webdulich.customer.Customer;
import webdulich.webdulich.tour.Tour;

import javax.persistence.*;
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Customer customer;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id", referencedColumnName = "id")
    private Tour tour;
    private String phoneNumber;
    private Date timestamp;

    public Booking(Customer customer, Tour tour, String phoneNumber) {
        this.customer = customer;
        this.tour = tour;
        this.phoneNumber = phoneNumber;
        this.timestamp = new Date(System.currentTimeMillis());
    }

    public Booking(long id, Customer customer, Tour tour, String phoneNumber, Date timestamp) {
        this.id = id;
        this.customer = customer;
        this.tour = tour;
        this.phoneNumber = phoneNumber;
        this.timestamp = timestamp;
    }

    public Booking() {

    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Tour getTour() {
        return this.tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    void setTimestamp() {
        this.timestamp = new Date(System.currentTimeMillis());
    }
}
