package com.haohui.SingletonPattern;

public class TicketMaker {
    private static final TicketMaker TICKET_MAKER=new TicketMaker();

    public static TicketMaker getInstance(){
        return TICKET_MAKER;
    }

    private int ticket=1000;
    public int getNextTicketNumber(){
        return ticket++;
    }


}
