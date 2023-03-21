package com.company.model;
/* Violation LSV (Liskov Substitution Principle) */
public class BalconyTicket extends Ticket {

    public BalconyTicket(int ticket_id, String ticket_details) {
        super(ticket_id, ticket_details);
    }

    public  double getTicketPrice(){
        return 100;
    }
}
