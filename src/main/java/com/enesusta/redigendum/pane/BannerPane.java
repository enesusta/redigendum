package com.enesusta.redigendum.pane;

import com.enesusta.redigendum.components.Button;
import com.enesusta.redigendum.components.Field;
import com.enesusta.redigendum.components.GridBag;
import com.enesusta.redigendum.executor.ExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class BannerPane extends JPanel implements Pane {

    private ExecutorService service;

    BannerPane() {
        super();
        setLayout(new BorderLayout());
    }

    private void init() {

        Field field = new Field();

        Button button = new Button("Run", Color.RED);
        button.addActionListener(actionEvent -> {
            service.execute(field.getText());
        });

        GridBag gridBag = new GridBag();

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1;

        constraints.weightx = 0.20;
        constraints.gridx = 0;
        gridBag.add(new Button("1", Color.green), constraints);

        constraints.weightx = 0.60;
        constraints.gridx = 1;
        gridBag.add(field, constraints);

        constraints.weightx = 0.20;
        constraints.gridx = 2;
        gridBag.add(button, constraints);

        add(gridBag);
    }

    @Override
    public JPanel getPane() {
        init();
        return this;
    }

    @Autowired
    public void setService(ExecutorService service) {
        this.service = service;
    }
}
