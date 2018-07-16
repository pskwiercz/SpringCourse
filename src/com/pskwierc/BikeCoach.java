package com.pskwierc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeCoach implements Coach {

    private FortuneService fortuneService;

    // Autowired - constructor injection
    @Autowired
    public BikeCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run bike for 1 hour!";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }
}
