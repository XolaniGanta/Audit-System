package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Issue;
import com.personalProject.demo.Entity.Ticket;
import com.personalProject.demo.Util.GenerateID;

import java.time.LocalDate;

public class TicketFactory {

    public static Ticket createTicket(Issue ticketIssue) {
        LocalDate now = LocalDate.now();
        String ticketID = GenerateID.generateID();

        Ticket ticket = new Ticket.Builder()
                .setTicketId(ticketID)
                .setTicketIssue(ticketIssue)
                .setTicketDate(now)
                .build();
        return ticket;
    }
}
