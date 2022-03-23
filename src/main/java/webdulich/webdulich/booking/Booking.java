package webdulich.webdulich.booking;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;

import webdulich.webdulich.customer.Customer;
import webdulich.webdulich.tour.Tour;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
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

    void setTimestamp() {
        this.timestamp = new Date(System.currentTimeMillis());
    }
}
