package com.haohui.Iterator.impl;

import com.haohui.Iterator.entity.Book;
import com.haohui.Iterator.Iterator;

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
