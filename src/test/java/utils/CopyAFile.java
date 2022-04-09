package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyAFile {

    /**
     * Need refactor in the future
     */
    public static void doCopyFile() {
        File source = new File("src/test/");
        File dest = new File("build/allure-results");
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

