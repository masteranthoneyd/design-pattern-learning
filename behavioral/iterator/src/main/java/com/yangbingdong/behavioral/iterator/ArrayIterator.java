package com.yangbingdong.behavioral.iterator;

import java.util.ArrayList;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class ArrayIterator<E> implements Iterator<E>{

    private ArrayList<E> list;

    private int cursor;

    public ArrayIterator(ArrayList<E> list) {
        this.list = list;
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public E next() {
        return list.get(cursor++);
    }
}
