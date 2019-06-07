package com.enesusta.redigendum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class B extends JPanel implements View {

    @Autowired
    @Qualifier("a")
    private Window window;

    @Autowired
    @Qualifier("c")
    private Window windowB;

    public B() {
        super();
        setLayout(new GridLayout(1,2));
    }


    @Override
    public JPanel getComponent() {

        add(window.init());
        add(windowB.init());

        return this;
    }
}
