package com.github.haohuiw.Singleton;

public class Singleton {
    private String message;
    private static final Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个单例模式对象的实例");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
