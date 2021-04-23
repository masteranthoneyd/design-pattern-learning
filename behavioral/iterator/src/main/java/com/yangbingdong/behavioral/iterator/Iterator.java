package com.yangbingdong.behavioral.iterator;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
