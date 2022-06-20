package com.haohui.SingletonPattern;

public class Triple {
    static final private Triple[] TRIPLES=new Triple[]{
            new Triple(),new Triple(),new Triple()
    };
    static public Triple getInstance(int id){
        return TRIPLES[id];
    }

    private String message;
    private Triple(){};

}
