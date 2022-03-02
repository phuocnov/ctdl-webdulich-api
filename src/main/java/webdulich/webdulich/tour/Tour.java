package webdulich.webdulich.tour;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity(name = "tour")
@Table
public class Tour {
    @Id
    @SequenceGenerator(name = "tour_sequence", sequenceName = "tour_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tour_sequence")
    private int ID;
    private String name;
    private String tour;
    @Transient
    private int dateLast;
    @Transient
    private int nightLast;
    private String schedule;
    private LocalDate startDate;
    private LocalDate endDate;
    private int cost;
    private String description;
}