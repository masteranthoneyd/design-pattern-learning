package com.yangbingdong.structure.composite;

import com.yangbingdong.structure.composite.negetive.NegetiveFileSystemNode;
import com.yangbingdong.structure.composite.positive.Directory;
import com.yangbingdong.structure.composite.positive.File;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class FileSystemNodeTest {


    @Test
    void testPositiveFileSystemNode() {
        /*
          /
          /wz/
          /wz/a.txt
          /wz/b.txt
          /wz/movies/
          /wz/movies/c.avi
          /xzg/
          /xzg/docs/
          /xzg/docs/d.txt
         */
        Directory fileSystemTree = new Directory("/");
        Directory node_wz = new Directory("/wz/");
        Directory node_xzg = new Directory("/xzg/");
        fileSystemTree.addSubNode(node_wz);
        fileSystemTree.addSubNode(node_xzg);

        File node_wz_a = new File("/wz/a.txt");
        File node_wz_b = new File("/wz/b.txt");
        Directory node_wz_movies = new Directory("/wz/movies/");
        node_wz.addSubNode(node_wz_a);
        node_wz.addSubNode(node_wz_b);
        node_wz.addSubNode(node_wz_movies);

        File node_wz_movies_c = new File("/wz/movies/c.avi");
        node_wz_movies.addSubNode(node_wz_movies_c);

        Directory node_xzg_docs = new Directory("/xzg/docs/");
        node_xzg.addSubNode(node_xzg_docs);

        File node_xzg_docs_d = new File("/xzg/docs/d.txt");
        node_xzg_docs.addSubNode(node_xzg_docs_d);

        System.out.println("/ files num:" + fileSystemTree.countNumOfFiles());
        System.out.println("/wz/ files num:" + node_wz.countNumOfFiles());
    }

    @Test
    void testNegetiveFileSystemNode() {
        /*
          /
          /wz/
          /wz/a.txt
          /wz/b.txt
          /wz/movies/
          /wz/movies/c.avi
          /xzg/
          /xzg/docs/
          /xzg/docs/d.txt
         */
        NegetiveFileSystemNode fileSystemTree = new NegetiveFileSystemNode("/", false);
        NegetiveFileSystemNode node_wz = new NegetiveFileSystemNode("/wz/", false);
        NegetiveFileSystemNode node_xzg = new NegetiveFileSystemNode("/xzg/", false);
        fileSystemTree.addSubNode(node_wz);
        fileSystemTree.addSubNode(node_xzg);

        NegetiveFileSystemNode node_wz_a = new NegetiveFileSystemNode("/wz/a.txt", true);
        NegetiveFileSystemNode node_wz_b = new NegetiveFileSystemNode("/wz/b.txt", true);
        NegetiveFileSystemNode node_wz_movies = new NegetiveFileSystemNode("/wz/movies/", false);
        node_wz.addSubNode(node_wz_a);
        node_wz.addSubNode(node_wz_b);
        node_wz.addSubNode(node_wz_movies);

        NegetiveFileSystemNode node_wz_movies_c = new NegetiveFileSystemNode("/wz/movies/c.avi", true);
        node_wz_movies.addSubNode(node_wz_movies_c);

        NegetiveFileSystemNode node_xzg_docs = new NegetiveFileSystemNode("/xzg/docs/", false);
        node_xzg.addSubNode(node_xzg_docs);

        NegetiveFileSystemNode node_xzg_docs_d = new NegetiveFileSystemNode("/xzg/docs/d.txt", true);
        node_xzg_docs.addSubNode(node_xzg_docs_d);

        System.out.println("/ files num:" + fileSystemTree.countNumOfFiles());
        System.out.println("/wz/ files num:" + node_wz.countNumOfFiles());
    }

}
