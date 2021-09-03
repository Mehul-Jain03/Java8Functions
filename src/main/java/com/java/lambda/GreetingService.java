package com.java.lambda;


//Lambda will work only for interface which has one abstract method. The moment you add one more method it will throw error where we
//defined lambda for that interface. How to overcome -?  so that new joinee will not add another method? Check below.

//Sam - Single abstract method concept

@FunctionalInterface
public interface GreetingService {
    void greet(String name);
}