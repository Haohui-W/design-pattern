package com.github.haohuiw.Iterator.entity;

/**
 * @author Haohui
 */
public class Book {
    private final String name;

    public String getName() {
        return name;
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
