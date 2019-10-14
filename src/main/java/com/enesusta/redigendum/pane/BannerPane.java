package com.enesusta.redigendum.pane;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class BannerPane extends JPanel implements Pane {

    BannerPane() {
        super();
        init();
    }

    private void init() {

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1;


    }

    @Override
    public JPanel getPane() {
        return this;
    }
}
