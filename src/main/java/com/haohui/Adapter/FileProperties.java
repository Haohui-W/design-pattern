package com.haohui.Adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

/**
 * @author Haohui
 */
public class FileProperties extends Properties implements FileIo{
    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String comment="written by FileProperties\n"+ LocalDateTime.now();
        store(new FileOutputStream(filename),comment);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}

