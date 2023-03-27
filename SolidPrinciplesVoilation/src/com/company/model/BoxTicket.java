package com.company.model;
/* Violation LSV (Liskov Substitution Principle) */
public class BoxTicket extends Ticket    {

    public BoxTicket(int ticket_id, String ticket_details) {
        super(ticket_id, ticket_details);
    }

    public double getTicketPrice(){
        Discount discount=new Discount();
        return 300-discount.getDiscount(300);
    }
}
