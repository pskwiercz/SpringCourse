package com.pskwierc;

public class SwimmCoach implements Coach {

    private FortuneService fortuneService;

    public SwimmCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Let's swimm";
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }
}
