package com.enesusta.redigendum.components;

import com.enesusta.redigendum.pane.Pane;
import com.enesusta.redigendum.window.Window;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class Frame extends JFrame implements AWTFrame {

    private Window defaultWindow;
    private Pane bannerPane;

    public Frame() {
        setLayout(new BorderLayout());
        setTitle("Redigendum 0.1.2");
        setMinimumSize(new Dimension(400, 400));
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
    }


    @Autowired
    public void setDefaultWindow(Window defaultWindow) {
        this.defaultWindow = defaultWindow;
    }

    @Autowired
    public void setBannerPane(Pane bannerPane) {
        this.bannerPane = bannerPane;
    }

    @Override
    public void initFrame() {

        add(bannerPane.getPane(), BorderLayout.NORTH);
        add(defaultWindow.getWindow(), BorderLayout.CENTER);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> this.init());
    }
}
