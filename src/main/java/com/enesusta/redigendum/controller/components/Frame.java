package com.enesusta.redigendum.controller.components;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIcon();
    }



    public Frame(String tex) {
        super(tex);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.NORMAL);
        setIcon();
    }

    public void init() {
        this.pack();
        this.setVisible(true);

    }

    private void setIcon() {

    }

}
