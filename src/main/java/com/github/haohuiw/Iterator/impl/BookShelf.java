package com.github.haohuiw.Iterator.impl;

import com.github.haohuiw.Iterator.Aggregate;
import com.github.haohuiw.Iterator.Iterator;
import com.github.haohuiw.Iterator.entity.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haohui
 */
public class BookShelf implements Aggregate<Book> {
    private final List<Book> books=new ArrayList<>();
    private int last=0;
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
    public int getLength(){
        return last;
    }
    public void addBook(Book book){
        books.add(book);
        last++;
    }
    public Book getBookAt(int index){
        return books.get(index);
    }
}
