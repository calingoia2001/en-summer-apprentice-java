package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "VENUE")
public class Venue {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long venueID;

    @NotNull
    @Column ( name = "locationName" )
    private String locationName;

    @NotNull
    @Column ( name = "locationType" )
    private String locationType;

    @Column(name = "capacity")
    private int capacity;

    public Venue() {}

    public Venue(Long venueID, String locationName, String locationType, int capacity) {
        this.venueID = venueID;
        this.locationName = locationName;
        this.locationType = locationType;
        this.capacity = capacity;
    }

    public Long getVenueID() {
        return venueID;
    }

    public void setVenueID(Long venueID) {
        this.venueID = venueID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
