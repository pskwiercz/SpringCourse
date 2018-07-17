package com.pskwierc;

import org.springframework.beans.factory.annotation.Value;

public class SwimmCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.team}")
    private String team;

    public SwimmCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Let's swimm";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }
}
