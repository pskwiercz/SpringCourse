package com.pskwierc;

import org.springframework.stereotype.Component;

@Component
public class TennisPrice implements Price {

    @Override
    public int getWorkoutPrice() {
        return 10;
    }
}
