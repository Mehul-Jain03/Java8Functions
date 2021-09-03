package com.java.supplier.drivers;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Rules {

    //Rule 1
    private static Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
    //Rule 2
    private static Predicate<WebElement> hasS = (e) -> e.getText().toLowerCase().contains("s");

    public static List<Predicate<WebElement>> get(){

        List<Predicate<WebElement>> rules = new ArrayList<>();
        rules.add(isBlank);
        rules.add(hasS);
        return rules;
    };
}
