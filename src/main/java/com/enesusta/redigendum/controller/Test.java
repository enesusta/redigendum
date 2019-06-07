package com.enesusta.redigendum.controller;

import com.enesusta.redigendum.controller.components.Frame;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("file:src/main/resources/spring/applicationContext.xml");

        View view = context.getBean("b", View.class);

        Frame x = new Frame("Test");
        x.add(view.getComponent());

        x.init();

    }

}
