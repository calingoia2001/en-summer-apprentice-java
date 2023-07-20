package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Orders;
import com.example.Java.Ticket.Project.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersService implements iOrdersService{
    private final OrdersRepository ordersRepository;
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<Orders> getOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public void createOrders(Orders orders) {
        ordersRepository.save(orders);
    }
}
