package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long orderID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID", referencedColumnName = "ticketCategoryID")
    private TicketCategory ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "customerID")
    private Customer customerID;

    @Column ( name = "orderedAt" )
    private Date orderedAt;

    @Column ( name = "numberOfTickets" )
    private int numberOfTickets;

    @Column ( name = "totalPrice" )
    private int totalPrice;

    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", ticketCategoryID=" + ticketCategoryID +
                ", customerID=" + customerID +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public TicketCategory getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(TicketCategory ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
