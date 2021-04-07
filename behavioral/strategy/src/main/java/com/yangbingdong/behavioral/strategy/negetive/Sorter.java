package com.yangbingdong.behavioral.strategy.negetive;

import java.io.File;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */

public class Sorter {
    static final long GB = 1000 * 1000 * 1000;

    public void sortFile(File file) {
        long fileSize = file.length();
        if (fileSize < 6 * GB) { // [0, 6GB)
            quickSort(file);
        } else if (fileSize < 10 * GB) { // [6GB, 10GB)
            externalSort(file);
        } else if (fileSize < 100 * GB) { // [10GB, 100GB)
            concurrentExternalSort(file);
        } else { // [100GB, ~)
            mapreduceSort(file);
        }
    }

    protected void quickSort(File file) {
        // 快速排序
    }

    protected void externalSort(File file) {
        // 外部排序
    }

    protected void concurrentExternalSort(File file) {
        // 多线程外部排序
    }

    protected void mapreduceSort(File file) {
        // 利用MapReduce多机排序
    }
}

