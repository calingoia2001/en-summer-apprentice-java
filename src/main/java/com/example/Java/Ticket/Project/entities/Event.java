package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "EVENT")
public class Event {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventID;

    @ManyToOne
    @JoinColumn(name = "venueID", referencedColumnName = "venueID")
    private Venue venueID;

    @ManyToOne
    @JoinColumn(name = "eventTypeID", referencedColumnName = "eventTypeID")
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


}

