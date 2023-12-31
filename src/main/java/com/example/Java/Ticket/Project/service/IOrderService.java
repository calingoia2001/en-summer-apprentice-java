package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    List<OrderDTO> getOrders(Long customerID);
    Optional<Order> createOrder(long eventID, long ticketCategoryID, int numberOfTickets);
}
