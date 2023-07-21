package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;
import com.example.Java.Ticket.Project.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService implements iOrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDTO> getOrders() {
        return orderRepository.findAll().stream().map(orders -> new OrderDTO(
            orders.getTicketCategory().getEventID().getEventID(),
            orders.getOrderedAt(),
            orders.getTicketCategory().getTicketCategoryID(),
            orders.getNumberOfTickets(),
            orders.getTotalPrice()
        )).collect(Collectors.toList());
    }

    @Override
    public void createOrders(Order order) {
        orderRepository.save(order);
    }
}
