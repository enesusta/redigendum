package com.enesusta.redigendum.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {

    public static ApplicationContext getCurrentContext() {
        final ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        return context;
    }

}
