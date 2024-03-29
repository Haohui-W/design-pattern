package com.github.haohuiw.Iterator;

import com.github.haohuiw.Iterator.impl.BookShelf;
import com.github.haohuiw.Iterator.entity.Book;


/**
 * @author Haohui
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("JAVA编程思想"));
        bookShelf.addBook(new Book("JAVA核心技术"));
        bookShelf.addBook(new Book("Spring实战"));
        bookShelf.addBook(new Book("图解HTTP"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
