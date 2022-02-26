package webdulich.webdulich.tour;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

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



    public Tour(int ID, String name, String tour, int dateLast, int nightLast, String schedule, LocalDate startDate, LocalDate endDate, int cost, String description) {
        this.ID = ID;
        this.name = name;
        this.tour = tour;
        this.dateLast = dateLast;
        this.nightLast = nightLast;
        this.schedule = schedule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
    }

    public Tour(String name, String tour, int dateLast, int nightLast, String schedule, LocalDate startDate, LocalDate endDate, int cost, String description) {
        this.name = name;
        this.tour = tour;
        this.dateLast = dateLast;
        this.nightLast = nightLast;
        this.schedule = schedule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTour() {
        return this.tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public int getDateLast() {
        return this.dateLast;
    }

    public void setDateLast(int dateLast) {
        this.dateLast = dateLast;
    }

    public int getNightLast() {
        return this.nightLast;
    }

    public void setNightLast(int nightLast) {
        this.nightLast = nightLast;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}