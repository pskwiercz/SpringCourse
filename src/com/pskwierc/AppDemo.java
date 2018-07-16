package com.pskwierc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contect =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach tennisCoach = contect.getBean("tCoach", TennisCoach.class);
        BikeCoach bikeCoach = contect.getBean("bikeCoach", BikeCoach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getFortuneService().getFortune());
        System.out.println(tennisCoach.getPrice().getWorkoutPrice());

        System.out.println(bikeCoach.getDailyWorkout());
        System.out.println(bikeCoach.getFortuneService().getFortune());

        contect.close();

    }
}
