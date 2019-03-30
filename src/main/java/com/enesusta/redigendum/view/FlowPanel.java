package com.enesusta.redigendum.view;

import com.enesusta.redigendum.controller.IDimension;

import javax.swing.*;
import java.awt.*;

public class FlowPanel extends JPanel {


    private JButton[] buttons;
    private IDimension iDimension;

    public FlowPanel() {

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDimension();
        organizeButtons();
        //addComponents();
        initializePanels();

    }

    public void organizeButtons() {
        buttons = new JButton[3];
        buttons[0] = new JButton("5");
        buttons[1] = new JButton("6");
        buttons[2] = new JButton("7");
    }

    public void initializePanels() {

        JPanel[] panels = new JPanel[8];


        for(int i=0;i<panels.length;i++)
            panels[i] = getInstance();


        for (JPanel pane : panels) {
            pane.setPreferredSize(new Dimension(100, 200));
            pane.setBackground(Color.RED);
        }

        for (JPanel pane : panels) {
            this.add(pane);
        }


    }


    public void addComponents() {
        for (JButton button : buttons) {
            button.setPreferredSize(iDimension.getDimension());
            this.add(button);
        }
    }

    public void setDimension() {
        iDimension = new IDimension(100, 100);
    }


    public JPanel getInstance() {
        return new JPanel();
    }


}
