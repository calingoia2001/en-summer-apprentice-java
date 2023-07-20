package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "EVENT_TYPE")
public class EventType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventTypeID;

    @NotNull
    @Column ( name = "eventTypeName" )
    private String eventTypeName;

    public EventType() {}

    public EventType(Long eventTypeID, String eventTypeName) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
    }

    public Long getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(Long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
