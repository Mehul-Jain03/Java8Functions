package com.java.util;

import com.java.supplier.DriverFactory;
import com.java.supplier.pages.CriteriaSupplier;
import com.java.supplier.pages.TableDemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestMain {

    private WebDriver driver;

   // https://the-internet.herokuapp.com/broken_images

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
    }

//    @Test
//    public void linkTest() {
//      this.driver.get("https://the-internet.herokuapp.com/broken_images");
//      this.driver.findElements(By.xpath("//*[@src]")).
//              stream().
//              map(e -> e.getAttribute("src")).
//              forEach(src ->{
//                      System.out.println(LinkUtil.getResponseCode(src) + " : : " +src);
//              });
//    }

/*    @Test
    public void linkTestViaAnyMatch() {
        this.driver.get("https://the-internet.herokuapp.com/broken_images");
        boolean result = this.driver.findElements(By.xpath("//*[@src]")).
                stream().
                map(e -> e.getAttribute("src")).
                map(src -> LinkUtil.getResponseCode(src)).
                anyMatch(code -> code !=200);
        Assert.assertEquals(false,result);
    }*/

    @Test
    public void linkTestViaCollect() {
        this.driver.get("https://the-internet.herokuapp.com/broken_images");
        List<String> list = this.driver.findElements(By.xpath("//*[@src]")).
                stream().
                map(e -> e.getAttribute("src")).
                filter(src ->LinkUtil.getResponseCode(src) !=200).
                collect(Collectors.toList());
        Assert.assertEquals(0,list.size(),list.toString());
    }

    @AfterTest
    public void quit(){
        this.driver.quit();
    }

}