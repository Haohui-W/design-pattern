package com.haohui.TemplateMethod;

public class StringDisplay extends AbstractDisplay {

    private final String message;

    public StringDisplay(String message) {
        this.message = message;
    }

    @Override
    public void open() {
        System.out.print('+');
        for (int i = 0; i < message.length(); i++) {
            System.out.print('-');
        }
        System.out.println('+');
    }

    @Override
    public void print() {
        System.out.println("|" + message + "|");
    }

    @Override
    public void close() {
        open();
    }
}
