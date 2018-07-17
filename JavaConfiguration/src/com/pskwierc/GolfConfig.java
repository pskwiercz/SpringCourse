package com.pskwierc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GolfConfig {

    @Bean
    public FortuneService fortuneService() {
        return new HardFortuneService();
    }

    @Bean
    public Coach golfCoach(FortuneService fortuneService) {
        return new GolfCoach(fortuneService);
    }
}
