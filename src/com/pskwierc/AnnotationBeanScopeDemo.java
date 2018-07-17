package com.pskwierc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach1 = context.getBean("bikeCoach", Coach.class);

        Coach coach2 = context.getBean("bikeCoach", Coach.class);

        boolean result = (coach1 == coach2);

        System.out.println(result);
        System.out.println("Coach1 addr: " + coach1);
        System.out.println("Coach2 addr: " + coach2);

        context.close();
    }
}
