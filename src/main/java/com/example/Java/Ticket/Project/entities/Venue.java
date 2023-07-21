package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "VENUE")
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long venueID;

    @Column ( name = "locationName" )
    private String locationName;

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

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", locationName='" + locationName + '\'' +
                ", locationType='" + locationType + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venue venue = (Venue) o;
        return capacity == venue.capacity && Objects.equals(venueID, venue.venueID) && Objects.equals(locationName, venue.locationName) && Objects.equals(locationType, venue.locationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueID, locationName, locationType, capacity);
    }
}
