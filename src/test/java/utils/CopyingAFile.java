package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyingAFile {

    /**
     * Need refactor in the future
     */
    public static void doCopyingAFile() {
        File source = new File("src/test/resources/categories.json");
        File dest = new File("build/allure-results/categories.json");
        try {
            FileUtils.copyFile(source, dest);
            System.out.println("File categories.json successfully copied in allure-results");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

