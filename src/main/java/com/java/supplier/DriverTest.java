package com.java.supplier;

import com.java.supplier.drivers.Rules;
import com.java.supplier.pages.CriteriaSupplier;
import com.java.supplier.pages.TableDemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class DriverTest {

    private WebDriver driver;
    private TableDemoPage tablePageDemo;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.tablePageDemo = new TableDemoPage(driver);
    }

   // @Test
 /*   public void googleTest(){

        //Part 1
        this.driver.get("https://google.com");
        // this.driver.findElements(By.tagName("a")).forEach(e -> System.out.println(e.getText()));

*//*        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
        System.out.println("Elements Size Before : " +elements.size());
      //  Rules.get().forEach((rule) -> elements.removeIf(rule));
        Rules.get().forEach(elements::removeIf);
        System.out.println("Elements Size After : " +elements.size());
        elements.forEach((e) -> System.out.println(e.getText()));*//*

                this.driver.findElements(By.tagName("a")).stream().
                map(WebElement::getText).
                map(String::trim).
                filter(i -> i.length()>0).
                filter(i -> ! i.toLowerCase().contains("s")).
                map(String::toUpperCase).
                forEach(System.out::println);
    }
    */

/*    @Test
    public void assignmentsCheckBoxes(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        this.driver.findElements(By.xpath("//input[@type='checkbox']")).
                stream().
                forEach(WebElement::click);
    }*/

    @Test(dataProvider = "selectCriteria")
    public void assignmentsCheckBoxesBasedOnGender(Predicate<List<WebElement>> searchCriteria) throws InterruptedException {
        tablePageDemo.goTo();
        tablePageDemo.selectRows(searchCriteria);
        Thread.sleep(5);
    }

    @DataProvider(name = "selectCriteria")
    public Object[] testData(){
        return new Object[] {
            CriteriaSupplier.getCriteria("allMale"),
            CriteriaSupplier.getCriteria("allFemale"),
            CriteriaSupplier.getCriteria("allGender"),
            CriteriaSupplier.getCriteria("allAU"),
            CriteriaSupplier.getCriteria("allAUFemale")
        };
    }

    @AfterTest
    public void quit(){
        this.driver.quit();
    }

}