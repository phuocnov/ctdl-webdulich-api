package webdulich.webdulich.toudetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tourDetail")
public class TourDetails {
    @Id
    @SequenceGenerator(name = "tour_sequence", sequenceName = "tour_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tour_sequence")
    private int id;
    private String schedule;
    private String service;
    private String note;


    public TourDetails(String schedule, String service, String note) {
        this.schedule = schedule;
        this.service = service;
        this.note = note;
    }

}
