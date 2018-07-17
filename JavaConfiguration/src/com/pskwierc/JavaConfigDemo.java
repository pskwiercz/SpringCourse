package com.pskwierc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

//        BikeCoach theCoach = context.getBean("bikeCoach", BikeCoach.class);
        SwimmCoach theCoach = context.getBean("swimmCoach", SwimmCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortuneService().getFortune());

        context.close();
    }
}
