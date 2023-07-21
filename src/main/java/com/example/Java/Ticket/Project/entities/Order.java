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
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ORDERS")
public class Order implements Serializable {
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
    private LocalDate orderedAt;

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

    public LocalDate getOrderedAt() {
        return orderedAt;
    }
    public void setOrderedAt(LocalDate orderedAt) { this.orderedAt = orderedAt; }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOfTickets == order.numberOfTickets && totalPrice == order.totalPrice && Objects.equals(orderID, order.orderID) && Objects.equals(ticketCategory, order.ticketCategory) && Objects.equals(customer, order.customer) && Objects.equals(orderedAt, order.orderedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, ticketCategory, customer, orderedAt, numberOfTickets, totalPrice);
    }
}
