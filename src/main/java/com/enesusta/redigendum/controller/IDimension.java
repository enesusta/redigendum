package com.enesusta.redigendum.controller;

import java.awt.*;

public class IDimension {

    private Dimension dimension;

    public IDimension(int x,int y) {
        dimension = new Dimension(x,y);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Dimension getDefault() {
        return new Dimension(400,400);
    }

}
