package se.crowdAvoider.crowdAvoider.domain;

import javax.persistence.*;

@Entity
@Table(name = "EVENT")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "EVENT_ID")
    private int eventID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VENUE")
    private String venue;

    @Column(name = "ADRESS")
    private String adress;

    @Column(name = "EVENT_DATE")
    private String date;

    public Event(String name, String venue, String adress, String date) {
        this.name = name;
        this.venue = venue;
        this.adress = adress;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
