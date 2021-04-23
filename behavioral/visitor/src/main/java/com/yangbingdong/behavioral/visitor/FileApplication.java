package com.yangbingdong.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class FileApplication {


    public static void main(String[] args) {
        ResourceFile txtResourceFile = new TxtResourceFile("a.txt");
        ResourceFile pdfResourceFile = new PdfResourceFile("xxx.pdf");
        ResourceFile pptResourceFile = new PptResourceFile("666.ppt");
        FileApplication fileApplication = new FileApplication(Arrays.asList(txtResourceFile, pdfResourceFile, pptResourceFile));
        fileApplication.compressFile();
        fileApplication.extractFile();
    }

    private List<ResourceFile> resourceFiles;

    public FileApplication(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
    }

    public void extractFile() {
        Visitor compressor = new Extractor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.visit(compressor);
        }
    }

    public void compressFile() {
        Visitor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.visit(compressor);
        }
    }
}
