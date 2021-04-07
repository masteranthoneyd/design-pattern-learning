package com.yangbingdong.behavioral.strategy.positive;

import java.io.File;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Sorter {

    static final long GB = 1000 * 1000 * 1000;

    private final SortAlgoStrategy sortAlgoStrategy;

    public Sorter(SortAlgoStrategy sortAlgoStrategy) {
        this.sortAlgoStrategy = sortAlgoStrategy;
    }

    public void sort(File file) {
        SortAlgo sortAlgo = sortAlgoStrategy.getSortAlgo(file.length());
        sortAlgo.sort(file);
    }

}
