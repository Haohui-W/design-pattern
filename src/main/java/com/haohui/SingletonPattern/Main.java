package com.haohui.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("instance1==instance2: " + (instance1 == instance2));


    }
}
