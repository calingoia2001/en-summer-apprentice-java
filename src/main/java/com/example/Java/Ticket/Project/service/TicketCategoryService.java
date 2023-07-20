package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.TicketCategory;
import com.example.Java.Ticket.Project.repository.TicketCategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketCategoryService implements iTicketCategoryService{
    private final TicketCategoryRepository ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public List<TicketCategory> getTicketCategory() {
        return ticketCategoryRepository.findAll();
    }

    @Override
    public void createTicketCategory(TicketCategory ticketCategory) {
        ticketCategoryRepository.save(ticketCategory);
    }
}
