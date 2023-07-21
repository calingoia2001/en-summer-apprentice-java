package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Orders;
import com.example.Java.Ticket.Project.entities.dtos.OrdersDTO;
import com.example.Java.Ticket.Project.repository.OrdersRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService implements iOrdersService{
    private final OrdersRepository ordersRepository;
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersDTO> getOrders() {
        return ordersRepository.findAll().stream().map(orders -> new OrdersDTO(
            orders.getTicketCategory().getEventID().getEventID(),
            orders.getOrderedAt(),
            orders.getTicketCategory().getTicketCategoryID(),
            orders.getNumberOfTickets(),
            orders.getTotalPrice()
        )).collect(Collectors.toList());
    }

    @Override
    public void createOrders(Orders orders) {
        ordersRepository.save(orders);
    }
}
