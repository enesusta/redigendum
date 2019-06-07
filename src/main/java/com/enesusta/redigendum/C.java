package com.enesusta.redigendum;

import com.enesusta.redigendum.controller.Window;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class C extends JPanel implements Window {


    public C() {
        super();
        setLayout(new BorderLayout());
    }


    @Override
    public JPanel init() {

        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(Color.BLUE);
        add(panel);

        return this;
    }
}
