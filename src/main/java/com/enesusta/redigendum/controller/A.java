package com.enesusta.redigendum.controller;


import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class A extends JPanel implements Window {

    public A() {
        super();
        setLayout(new BorderLayout());
    }

    @Override
    public JPanel init() {

        JPanel jPanel = new JPanel();
        jPanel.setOpaque(true);
        jPanel.setBackground(Color.RED);
        add(jPanel);


        return this;
    }
}
