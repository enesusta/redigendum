package com.enesusta.redigendum.view;

import com.enesusta.redigendum.controller.IDimension;

import javax.swing.*;
import java.awt.*;

public class FlowPanel extends JPanel {


    private JButton[] buttons;
    private IDimension iDimension;

    public FlowPanel() {

        setLayout(new FlowLayout());
        setDimension();
        organizeButtons();
        addComponents();


    }

    public void organizeButtons() {
        buttons = new JButton[3];
        buttons[0] = new JButton("0");
        buttons[1] = new JButton("1");
        buttons[2] = new JButton("2");

        
    }

    public void addComponents() {
        for (JButton button : buttons) {
            button.setPreferredSize(iDimension.getDimension());
            this.add(button);
        }
    }

    public void setDimension() {
        iDimension = new IDimension(200,200);
    }


}
