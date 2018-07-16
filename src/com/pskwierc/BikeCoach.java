package com.pskwierc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BikeCoach implements Coach {

    @Value("${foo.team}")
    private String team;

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run bike for 1 hour!";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getTeam() {
        return team;
    }
}
