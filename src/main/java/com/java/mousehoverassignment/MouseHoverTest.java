package com.java.mousehoverassignment;

import com.java.minrowassignment.MinRowPageObject;
import com.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;

public class MouseHoverTest {

    private WebDriver driver;
    private Actions action;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.action = new Actions(driver);
    }

    @Test(dataProvider = "linkNames")
    public void clickOnMinPriceRow(String path) throws InterruptedException {
       this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/drop-down.html");
        String[] split = path.split("=>");
        Arrays.stream(split).
                map(s -> s.trim()).
                map(s -> By.linkText(s)).
                map(by -> driver.findElement(by)).
                map(e -> action.moveToElement(e)).
                forEach(a -> a.perform());
                Thread.sleep(4000);
    }

    @DataProvider(name ="linkNames")
    public Object[] testData(){
        return new Object[]{
                "Dropdown => Dropdown Link 2",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.1",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.4 => Dropdown Submenu Link 5.4.2"
        };
    }

    @AfterTest
    public void quit(){
        this.driver.quit();
    }

}