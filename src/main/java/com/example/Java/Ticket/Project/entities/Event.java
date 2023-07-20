package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "EVENT")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventID;

    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venueID;

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventTypeID;

    @Column ( name = "eventDescription" )
    private String eventDescription;

    @Column ( name = "eventName" )
    private String eventName;

    @Column ( name = "startDate" )
    private Date startDate;

    @Column ( name = "endDate" )
    private Date endDate;

    public Event() {}

    public Event(Long eventID, Venue venueID, EventType eventTypeID, String eventDescription, String eventName, Date startDate, Date endDate) {
        this.eventID = eventID;
        this.venueID = venueID;
        this.eventTypeID = eventTypeID;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Venue getVenueID() {
        return venueID;
    }

    public void setVenueID(Venue venueID) {
        this.venueID = venueID;
    }

    public EventType getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(EventType eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", venueID=" + venueID +
                ", eventTypeID=" + eventTypeID +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

