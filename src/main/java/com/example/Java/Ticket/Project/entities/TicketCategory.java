package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TICKET_CATEGORY")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

    @Column ( name = "description" )
    private String description;

    @Column ( name = "Price" )
    private int price;

    public TicketCategory() {}
    public TicketCategory(Long ticketCategoryID, Event event, String description, int price) {
        this.ticketCategoryID = ticketCategoryID;
        this.event = event;
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
        return event;
    }
    public void setEventID(Event event) {
        this.event = event;
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
                ", event=" + event +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
