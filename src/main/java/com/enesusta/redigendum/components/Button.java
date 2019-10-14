package com.enesusta.redigendum.components;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text, Color color) {
        super(text);
        setFocusPainted(false);
        setColor(color);
        setContentAreaFilled(false);
        setOpaque(true);
    }

    public void setCenter() {
        setHorizontalTextPosition(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setOpaque(true);
    }

    @SuppressWarnings("Duplicates")
    public void setColor(Color color) {

        Icon icon = new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                g.setColor(color);
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
                g.setColor(Color.WHITE);
                g.drawRect(0,0,0,c.getHeight()+1);
            }

            @Override
            public int getIconWidth() {
                return 0;
            }

            @Override
            public int getIconHeight() {
                return 0;
            }
        };
        super.setIcon(icon);
    }

}
