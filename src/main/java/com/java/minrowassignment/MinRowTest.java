package com.java.minrowassignment;

import com.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class MinRowTest {

    private WebDriver driver;
    private MinRowPageObject minRowPageObject;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.minRowPageObject = new MinRowPageObject(driver);
    }

    @Test
    public void clickOnMinPriceRow() throws InterruptedException {
        minRowPageObject.selectMinPriceRow();
        Assert.assertEquals(minRowPageObject.getStatus(),"PASS");
        Thread.sleep(3000);
    }

    @AfterTest
    public void quit(){
        this.driver.quit();
    }

}