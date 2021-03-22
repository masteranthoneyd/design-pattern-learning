package com.yangbingdong.structure.composite.positive;

import com.yangbingdong.structure.composite.FileSystemNode;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class File implements FileSystemNode {

    private String path;

    public File(String path) {
        this.path = path;
    }

    @Override
    public int countNumOfFiles() {
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        java.io.File file = new java.io.File(path);
        if (!file.exists()) {
            return 0;
        }
        return file.length();
    }

    @Override
    public String getPath() {
        return path;
    }
}
