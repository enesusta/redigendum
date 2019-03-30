package com.enesusta.redigendum.view;

import javax.swing.*;
import java.awt.*;

public class PanelGenerator extends JPanel {

    private Dimension dimension;
    public JButton[] buttons;
    public FlowPanel flowPanel;
    public FlowPanel flowPanel2;

    public PanelGenerator() {

    }

    public PanelGenerator(int x,int y) {

        dimension = new Dimension(x,y);
        setLayout(new BorderLayout());
        organizeButtons();

        flowPanel = new FlowPanel();
        flowPanel.setPreferredSize(dimension);
        flowPanel2 = new FlowPanel();
        flowPanel2.setPreferredSize(dimension);


        add(flowPanel2,BorderLayout.SOUTH);
        add(flowPanel,BorderLayout.CENTER);
        add(buttons[3],BorderLayout.NORTH);

    }


    public JPanel generate() {

        JPanel temp = new JPanel();
        temp.setPreferredSize(dimension);
        temp.setBackground(Color.CYAN);

        return temp;
    }


    public void organizeButtons() {

        buttons = new JButton[10];
        buttons[0] = new JButton("0");
        buttons[0].setPreferredSize(dimension);
        buttons[1] = new JButton("1");
        buttons[2] = new JButton("2");
        buttons[3]= new JButton("3");

    }


    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
