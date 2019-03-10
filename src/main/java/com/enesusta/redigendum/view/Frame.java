package com.enesusta.redigendum.view;

import javax.swing.*;

/*
    @author : Enes Usta

 */


public class Frame extends JFrame {

    public Frame(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public void startGui() {
        this.pack();
        this.setVisible(true);
    }


}
