package webdulich.webdulich.tour;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import webdulich.webdulich.toudetail.TourDetails;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tour")
@Table
public class Tour {
    @Id
    @SequenceGenerator(name = "tour_sequence", sequenceName = "tour_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tour_sequence")
    private long id;
    private String name;
    private String tour;
    @Transient
    private long dateLast;
    @Transient
    private long nightLast;
    private String schedule;
    private LocalDate startDate;
    private LocalDate endDate;
    private int cost;
    @Lob
    private String shortDescription;


    public Tour(String name, String tour,  String schedule, LocalDate startDate, LocalDate endDate, int cost, String shortDescription, TourDetails details) {
        this.name = name;
        this.tour = tour;
        this.schedule = schedule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.shortDescription = shortDescription;
        this.details = details;

        this.dateLast = ChronoUnit.DAYS.between(this.startDate, this.endDate);
        this.nightLast = this.dateLast - 1;
    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_detail", referencedColumnName = "id")
    private TourDetails details;
}