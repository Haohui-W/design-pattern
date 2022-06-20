package com.haohui.Singleton;

public class TicketMaker {
    static final private TicketMaker TICKET_MAKER=new TicketMaker();

    static public TicketMaker getInstance(){
        return TICKET_MAKER;
    }

    private TicketMaker(){}

    private int ticket=1000;
    public int getNextTicketNumber(){
        return ticket++;
    }


}
