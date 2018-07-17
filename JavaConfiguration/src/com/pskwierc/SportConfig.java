package com.pskwierc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.pskwierc")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService fortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimmCoach(FortuneService fortuneService) {
        return new SwimmCoach(fortuneService);
    }

}
