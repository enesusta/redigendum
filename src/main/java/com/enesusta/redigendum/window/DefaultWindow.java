package com.enesusta.redigendum.window;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class DefaultWindow extends JPanel implements Window {

    public DefaultWindow() {

    }

    private void init() {

    }

    @Override
    public JPanel getWindow() {
        return this;
    }
}
