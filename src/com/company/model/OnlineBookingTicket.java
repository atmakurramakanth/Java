package com.company.model;

public class OnlineBookingTicket {
    private BankCard bankCard;
    public OnlineBookingTicket(BankCard bankCard){
        this.bankCard = bankCard;
    }
    public void doPayment(int amount){
        bankCard.bookTicket(amount);

    }
    public static void main(String[] args){
        BankCard bankCard =new DebitCard();
        OnlineBookingTicket onlineBookingTicket= new OnlineBookingTicket(bankCard);
        onlineBookingTicket.doPayment(500);

    }
}