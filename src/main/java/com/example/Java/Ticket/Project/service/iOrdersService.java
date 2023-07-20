package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Orders;
import java.util.List;

public interface iOrdersService {
    List<Orders> getOrders();
    void createOrders(Orders orders);
}
