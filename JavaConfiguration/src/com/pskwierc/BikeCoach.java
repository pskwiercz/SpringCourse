package com.pskwierc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class BikeCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run bike for 1 hour!";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(">>>>>> Post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(">>>>>> Pre Destroy");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

}
