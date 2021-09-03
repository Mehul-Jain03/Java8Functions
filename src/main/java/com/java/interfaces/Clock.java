package com.java.interfaces;

import java.time.LocalDateTime;

public class Clock implements Alarm {

    public void showTime(){
        System.out.println("This is the Time "+ LocalDateTime.now());
    }

    public void setAlarm(){
        System.out.println("Set the Alarm...");
    }
}
