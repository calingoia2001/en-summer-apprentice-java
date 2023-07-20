package com.example.Java.Ticket.Project.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
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
}
