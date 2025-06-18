package com.catfact.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiUtils {

    private static final Properties props = new Properties();


    public static String getProp(String prop) {
        String properties;
        Properties props = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream(
                    System.getProperty("user.dir") + "/src/test/resources/env.properties");
            props.load(file);
            properties = props.get(prop).toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;

    }
}
