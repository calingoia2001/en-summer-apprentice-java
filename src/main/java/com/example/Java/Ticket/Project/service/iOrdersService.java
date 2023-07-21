package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Orders;
import com.example.Java.Ticket.Project.entities.dtos.OrdersDTO;

import java.util.List;

public interface iOrdersService {
    List<OrdersDTO> getOrders();
    void createOrders(Orders orders);
}
