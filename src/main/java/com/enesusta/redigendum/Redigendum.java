package com.enesusta.redigendum;

import com.enesusta.redigendum.components.Frame;

import javax.swing.*;
import java.awt.*;


public class Redigendum {

    public static void main(String[] args) {

        Frame frame = new Frame("Redigendum 0.1.2");
        frame.setPreferredSize(new Dimension(400,400));

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(frame);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> frame.init());

    }


}
