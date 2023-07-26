package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.Customer;
import com.example.Java.Ticket.Project.entities.Order;
import com.example.Java.Ticket.Project.entities.TicketCategory;
import com.example.Java.Ticket.Project.entities.dtos.OrderDTO;
import com.example.Java.Ticket.Project.repository.CustomerRepository;
import com.example.Java.Ticket.Project.repository.OrderRepository;
import com.example.Java.Ticket.Project.repository.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final TicketCategoryRepository ticketCategoryRepository;

    public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
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

    //@Override
    //public void createOrders(Order order) {
        //orderRepository.save(order);
    //}

    @Override
    public Optional<Order> createOrder(/*long customerID, */long eventID, long ticketCategoryID, int numberOfTickets) {
        Customer customer = customerRepository.findCustomerByCustomerID(2);
        TicketCategory ticketCategory = ticketCategoryRepository.findTicketCategoryByTicketCategoryID(ticketCategoryID);

        if (customer == null || ticketCategory == null) {
            return Optional.empty();
        }

        Order order = new Order(ticketCategory, customer, numberOfTickets, LocalDate.now(), numberOfTickets * ticketCategory.getPrice());

        return Optional.of(orderRepository.save(order));
    }
}
