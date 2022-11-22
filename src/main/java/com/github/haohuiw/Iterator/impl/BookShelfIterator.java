package com.github.haohuiw.Iterator.impl;

import com.github.haohuiw.Iterator.Iterator;
import com.github.haohuiw.Iterator.entity.Book;

/**
 * @author Haohui
 */
public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index=0;
    }

    @Override
    public Book next() {

        return bookShelf.getBookAt(index++);
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }
}
