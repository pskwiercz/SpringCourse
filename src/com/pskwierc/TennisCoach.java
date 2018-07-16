package com.pskwierc;

import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play tennis for 30 minutes!";
    }
}
