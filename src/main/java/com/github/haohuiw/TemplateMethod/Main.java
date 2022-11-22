package com.github.haohuiw.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('我');
        AbstractDisplay display2 = new StringDisplay("你好，世界！");
        AbstractDisplay display3 = new StringDisplay("Hello World!");

        display1.display();
        display2.display();
        display3.display();

    }
}
