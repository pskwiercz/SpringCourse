package com.pskwierc;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    public GolfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Play golf one hour";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

}
