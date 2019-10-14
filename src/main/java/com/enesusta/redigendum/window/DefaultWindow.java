package com.enesusta.redigendum.window;

import com.enesusta.redigendum.components.Button;
import com.enesusta.redigendum.executor.ExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class DefaultWindow extends JPanel implements Window {


    public DefaultWindow() {
        super();
        setLayout(new BorderLayout());
    }

    private void init() {

    }

    @Override
    public JPanel getWindow() {
        init();
        return this;
    }

}
