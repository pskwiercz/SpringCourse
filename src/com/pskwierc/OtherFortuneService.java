package com.pskwierc;

import org.springframework.stereotype.Component;

@Component
public class OtherFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Hello - let's run!";
    }
}
