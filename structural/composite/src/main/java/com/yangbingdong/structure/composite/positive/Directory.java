package com.yangbingdong.structure.composite.positive;

import com.yangbingdong.structure.composite.FileSystemNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Directory implements FileSystemNode {

    private String path;

    private List<FileSystemNode> subsNodes = new ArrayList<>();

    public Directory(String path) {
        this.path = path;
    }

    @Override
    public int countNumOfFiles() {
        return subsNodes.stream().mapToInt(FileSystemNode::countNumOfFiles).sum();
    }

    @Override
    public long countSizeOfFiles() {
        return subsNodes.stream().mapToLong(FileSystemNode::countSizeOfFiles).sum();
    }

    @Override
    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNode fileSystemNode) {
        subsNodes.add(fileSystemNode);
    }
}
