package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyingAFile {

    /**
     * Copying a files in dest build/allure-results
     */
    public static void doCopyingAFile() {
        File srcCategories = new File("src/test/resources/categories.json");
        File srcEnvironment = new File("src/test/resources/environment.properties");
        File destCategories = new File("build/allure-results/categories.json");
        File destEnvironment = new File("build/allure-results/environment.properties");
        try {
            FileUtils.copyFile(srcCategories, destCategories);
            System.out.println("File categories.json successfully copied in allure-results");
            FileUtils.copyFile(srcEnvironment,destEnvironment);
            System.out.println("File environment.properties successfully copied in allure-results");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

