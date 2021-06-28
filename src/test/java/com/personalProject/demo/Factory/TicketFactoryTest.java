package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Issue;
import com.personalProject.demo.Entity.Ticket;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketFactoryTest {

    Issue issueTest = IssueFactory.createIssue("", "");
    @Test
    public void createTicket() {
        Ticket ticket = TicketFactory.createTicket(issueTest);
        Assert.assertNotEquals(null, ticket.getTicketId());//if the ticket has a ticketID it has been created
        System.out.println(ticket);

    }

}