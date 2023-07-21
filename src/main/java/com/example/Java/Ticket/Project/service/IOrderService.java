package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;
import java.util.List;

public interface IOrderService {
    List<OrderDTO> getOrders();
    void createOrders(Order order);
}
