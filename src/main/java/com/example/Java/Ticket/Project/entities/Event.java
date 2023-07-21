package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "EVENT")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventID;

    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TicketCategory> ticketCategories = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;

    @Column ( name = "eventDescription" )
    private String eventDescription;

    @Column ( name = "eventName" )
    private String eventName;

    @Column ( name = "startDate" )
    private Date startDate;

    @Column ( name = "endDate" )
    private Date endDate;

    public Event() {}
    public Event(Long eventID, Venue venue, EventType eventType, String eventDescription, String eventName, Date startDate, Date endDate) {
        this.eventID = eventID;
        this.venue = venue;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public List<TicketCategory> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategory> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }

    public Long getEventID() { return eventID; }
    public void setEventID(Long eventID) { this.eventID = eventID; }

    public Venue getVenue() { return venue; }
    public void setVenue(Venue venue) { this.venue = venue; }

    public EventType getEventType() { return eventType;}
    public void setEventType(EventType eventType) { this.eventType = eventType; }

    public String getEventDescription() { return eventDescription; }
    public void setEventDescription(String eventDescription) { this.eventDescription = eventDescription; }

    public String getEventName() { return eventName;}
    public void setEventName(String eventName) { this.eventName = eventName; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", venue=" + venue +
                ", eventType=" + eventType +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

