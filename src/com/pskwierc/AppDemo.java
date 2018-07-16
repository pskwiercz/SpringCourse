package com.pskwierc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contect =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = contect.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        contect.close();

    }
}
