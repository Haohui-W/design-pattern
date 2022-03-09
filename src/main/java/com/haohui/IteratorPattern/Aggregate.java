package com.haohui.IteratorPattern;

/**
 * @author Haohui
 */
public interface Aggregate<E> {
    /**
     * 获取迭代器对象
     * @return Iterator 迭代器对象
     */
    Iterator<E> iterator();
}
