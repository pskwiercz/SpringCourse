package com.pskwierc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contect =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = contect.getBean("tCoach", Coach.class);
        BikeCoach bikeCoach = contect.getBean("bikeCoach", BikeCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(bikeCoach.getDailyWorkout());
        System.out.println(bikeCoach.getFortuneService().getFortune());
        contect.close();

    }
}
