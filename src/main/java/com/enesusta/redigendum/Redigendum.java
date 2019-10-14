package com.enesusta.redigendum;

import com.enesusta.redigendum.components.AWTFrame;
import com.enesusta.redigendum.components.Frame;
import com.enesusta.redigendum.core.SpringUtils;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;


public class Redigendum {

    public static void main(String[] args) {

        final ApplicationContext context = SpringUtils.getCurrentContext();
        final AWTFrame frame = context.getBean(AWTFrame.class);
        frame.initFrame();

    }


}
