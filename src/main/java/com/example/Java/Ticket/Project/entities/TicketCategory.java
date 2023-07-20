package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TICKET_CATEGORY")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID", referencedColumnName = "eventID")
    private Event eventID;

    @Column ( name = "description" )
    private String description;

    @Column ( name = "Price" )
    private int price;

    public TicketCategory() {}

    public TicketCategory(Long ticketCategoryID, Event eventID, String description, int price) {
        this.ticketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        this.description = description;
        this.price = price;
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryID=" + ticketCategoryID +
                ", eventID=" + eventID +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
