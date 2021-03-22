package com.yangbingdong.structure.composite.negetive;

import com.yangbingdong.structure.composite.FileSystemNode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class NegetiveFileSystemNode implements FileSystemNode {

    private String path;

    private boolean isFile;

    private List<FileSystemNode> subsNode = new ArrayList<>();

    public NegetiveFileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    @Override
    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        return subsNode.stream().mapToInt(FileSystemNode::countNumOfFiles).sum();
    }

    @Override
    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (file.exists()) {
                return 0;
            }
            return file.length();
        }
        return subsNode.stream().mapToLong(FileSystemNode::countSizeOfFiles).sum();
    }

    @Override
    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNode fileSystemNode) {
        subsNode.add(fileSystemNode);
    }

    public void removeSubNode(FileSystemNode fileSystemNode) {
        subsNode.removeIf(e -> e.getPath().equals(path));
    }
}
