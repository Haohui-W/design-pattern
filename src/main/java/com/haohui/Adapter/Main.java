package com.haohui.Adapter;

import java.io.IOException;

/**
 * @author Haohui
 */
public class Main {
    public static void main(String[] args) {
        FileIo f = new FileProperties();
        try {
            f.readFromFile("D:\\Projects\\IdeaProjects\\java-examples-Haohui\\designPattern\\src\\main\\resources\\file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
