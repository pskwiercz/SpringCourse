package com.pskwierc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigGolfDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(GolfConfig.class);

        Coach theCoach = context.getBean("golfCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        context.close();
    }
}
