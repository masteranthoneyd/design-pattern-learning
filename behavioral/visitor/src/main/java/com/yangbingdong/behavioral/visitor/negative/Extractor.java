package com.yangbingdong.behavioral.visitor.negative;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Extractor {

    public void extract(Zip zip) {
        System.out.println("Extract zip");
    }

    public void extract(Rar rar) {
        System.out.println("Extract rar");
    }


    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = Arrays.asList(new Zip("xxx.zip"), new Rar("xxx.rar"));
        Extractor extractor = new Extractor();
        for (ResourceFile resourceFile : resourceFiles) {
            // extractor.extract(resourceFile);  // 这一行会编译报错
        }
    }
}
