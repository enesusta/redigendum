package com.enesusta.redigendum.controller;

import java.io.*;
import java.util.Properties;

public class Prop {

    public static void main(String[] args) throws IOException{
        loadProperties();
    }




    public static void saveProperties() throws IOException {
        // make new instance of properties
        Properties prop = new Properties();
        // set the property values
        prop.setProperty("name", "Steve");
        prop.setProperty("color", "green");
        prop.setProperty("age", "23");


        File file = new File("config.properties");
        if (!file.exists()) {
            file.createNewFile();
        }

        prop.store(new FileOutputStream(file), "Mysql");
    }

    public static void loadProperties() throws IOException {

        try(InputStream input =
                    new FileInputStream("config.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("age"));
            System.out.println(properties.getProperty("color"));




        }catch (IOException e) {
            e.printStackTrace();
        }






    }
}
