package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;
import com.example.Java.Ticket.Project.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDTO> getOrders(Long customerID) {
        return orderRepository.findAll().stream()
                .filter(order -> Objects.equals(order.getCustomer().getCustomerID(), customerID))
                .map(order -> new OrderDTO(
            order.getTicketCategory().getEventID().getEventID(),
            order.getOrderedAt(),
            order.getTicketCategory().getTicketCategoryID(),
            order.getNumberOfTickets(),
            order.getTotalPrice()
        )).collect(Collectors.toList());
    }

    @Override
    public void createOrders(Order order) {
        orderRepository.save(order);
    }
}
