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
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @Column ( name = "orderedAt" )
    private Date orderedAt;

    @Column ( name = "numberOfTickets" )
    private int numberOfTickets;

    @Column ( name = "totalPrice" )
    private int totalPrice;


    public Long getOrderID() {
        return orderID;
    }
    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }
    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomerID(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }
    public void setOrderedAt(Date orderedAt) { this.orderedAt = orderedAt; }

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

    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", ticketCategory=" + ticketCategory +
                ", customer=" + customer +
                ", orderedAt=" + orderedAt +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
