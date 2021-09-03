package com.java.lambda;

import com.java.interfaces.Alarm;
import com.java.interfaces.Clock;
import com.java.interfaces.GoogleMini;
import com.java.interfaces.Iphone;
import com.java.lambda.GreetingService;
import com.java.polymorhism.Animal;

public class TestMain {

    public static void main(String[] args) {
/*        //Cat a = new Cat();
        //Dog a = new Dog();
        //Horse a = new Horse();
        // test(a);

        Iphone i = new Iphone();
        testInterface(i);
        Clock c = new Clock();
        testInterface(c);
        GoogleMini g = new GoogleMini();
        testInterface(g);*/

        // Lambda
        GreetingService gs = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hi   "+name);
            }
        };
        gs.greet("Mehul");

        GreetingService gs1 = (name) -> System.out.println("Hello " +name);
        gs1.greet("Mehul");

    }

    public static void test(Animal a){
        a.makeSound();
        a.walk();
    }

    public static void testInterface(Alarm a){
    a.setAlarm();
    }
}
