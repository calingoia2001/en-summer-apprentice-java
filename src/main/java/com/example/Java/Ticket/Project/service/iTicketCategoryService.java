package com.example.Java.Ticket.Project.service;

import com.example.Java.Ticket.Project.entities.TicketCategory;
import java.util.List;

public interface iTicketCategoryService {
    List<TicketCategory> getTicketCategory();
    void createTicketCategory(TicketCategory ticketCategory);
}
