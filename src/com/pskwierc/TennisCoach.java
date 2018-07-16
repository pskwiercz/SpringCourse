package com.pskwierc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Play tennis for 30 minutes!";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    // Autowired - setter injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">>> TennisCoach: inside setFortune Service");
        this.fortuneService = fortuneService;
    }
}
