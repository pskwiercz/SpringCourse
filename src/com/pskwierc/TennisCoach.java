package com.pskwierc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

    // Autowired - field injection
    @Autowired
    private TennisPrice price;

    @Autowired
    @Qualifier("otherFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Play tennis for 30 minutes!";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public TennisPrice getPrice() {
        return price;
    }
}
