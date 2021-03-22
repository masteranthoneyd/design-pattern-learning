package com.yangbingdong.structure.composite;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface FileSystemNode {

    int countNumOfFiles();

    long countSizeOfFiles();

    String getPath();
}
