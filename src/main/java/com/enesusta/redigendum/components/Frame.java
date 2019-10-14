package com.enesusta.redigendum.components;

import com.enesusta.redigendum.window.Window;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class Frame extends JFrame implements AWTFrame{

    private Window defaultWindow;

    public Frame() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public Frame(String tex) {
        super(tex);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.NORMAL);
    }

    public void init() {
        pack();
        setVisible(true);
        add(defaultWindow.getWindow(),BorderLayout.CENTER);
    }

    @Override
    public JFrame getFrame() {
        return this;
    }

    @Autowired
    public void setDefaultWindow(Window defaultWindow) {
        this.defaultWindow = defaultWindow;
    }
}
