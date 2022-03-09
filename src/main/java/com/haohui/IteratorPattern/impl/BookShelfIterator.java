package com.haohui.IteratorPattern.impl;

import com.haohui.IteratorPattern.entity.Book;
import com.haohui.IteratorPattern.Iterator;

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
