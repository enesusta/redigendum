package com.enesusta.redigendum.view;

import javax.swing.*;
import java.awt.*;

public class PanelGenerator extends JPanel {

    private Dimension dimension;
    public JButton[] buttons;
    public FlowPanel flowPanel;

    public PanelGenerator() {

    }

    public PanelGenerator(int x,int y) {

        dimension = new Dimension(x,y);
        setLayout(new BorderLayout());
        organizeButtons();
        flowPanel = new FlowPanel();
        flowPanel.setPreferredSize(dimension);

        add(buttons[0],BorderLayout.NORTH);
        add(flowPanel,BorderLayout.CENTER);

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
        buttons[1] = new JButton("1");
        buttons[2] = new JButton("2");

    }




    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
