package com.enesusta.redigendum.controller;

public class SystemDAO {


    private String osName;

    public SystemDAO() {

        osName = System.getProperty("os.name");

    }

    public boolean isWindows() {
        return osName.startsWith("Windows");
    }

    public boolean isMac() {
        return getOsName().startsWith("Mac");
    }

    public boolean isUnix() {
        return getOsName().startsWith("Unix");
    }

    public String getOsName() {
        return osName;
    }


}
