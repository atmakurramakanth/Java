package com.company.model;

public class OnlineBookingTicket {
    private DebitCard debitCard;
    public OnlineBookingTicket(DebitCard debitCard){
        this.debitCard = debitCard;
    }
    public void doPayment(int amount){
        debitCard.bookTicket(amount);

    }
    public static void main(String[] args){
        DebitCard debitCard =new DebitCard();
        OnlineBookingTicket onlineBookingTicket= new OnlineBookingTicket(debitCard);
        onlineBookingTicket.doPayment(500);

    }
}
