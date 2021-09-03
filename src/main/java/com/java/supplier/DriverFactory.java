package com.java.supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver> chromeSupplier = () -> {
       System.setProperty("webdriver.chrome.driver","src/main/java/com/java/supplier/drivers/chromedriver");
       return new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        System.setProperty("webdriver.gecko.driver","src/main/java/com/java/supplier/drivers/geckodriver");
        return new FirefoxDriver();
    };

    private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<String, Supplier<WebDriver>>();

    static {
        MAP.put("chrome",chromeSupplier);
        MAP.put("firefox",firefoxSupplier);
    }

    public static WebDriver getDriver(String browser){
        return MAP.get(browser).get();
    }
}
