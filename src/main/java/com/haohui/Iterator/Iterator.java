package com.haohui.Iterator;

/**
 * @author Haohui
 */
public interface Iterator<E> {
    /**
     * 是否能执行next()
     * @return 是否能执行next()
     */
    boolean hasNext();

    /**
     * 获得下一个迭代对象
     * @return next对象
     */
    E next();
}
