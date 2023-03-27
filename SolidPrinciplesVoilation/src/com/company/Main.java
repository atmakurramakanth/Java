package com.company;

import com.company.model.BoxTicket;
import com.company.model.Ticket;
import com.company.model.UserData;

public class Main {

    public static void main(String[] args) {
        User ramakanth=new User();
        ramakanth.register(new UserData("ramkanth@gmail.com","ramakanth222","1234"));
        if(ramakanth.login(new UserData("ramakanth222","1234"))){
            System.out.println("USer Logged In!!!");
            BoxTicket movieTicket=new BoxTicket(1,"Box Ticket");
            System.out.println("Pls pay "+movieTicket.getTicketPrice()+" for "+movieTicket.getTicket_details());

        }else{
            System.out.println("User Login Failed!!!");
        }
    }
}