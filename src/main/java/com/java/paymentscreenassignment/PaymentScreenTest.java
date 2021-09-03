package com.java.paymentscreenassignment;

import com.google.common.util.concurrent.Uninterruptibles;
import com.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.util.TimeUtils;

import static com.java.paymentscreenassignment.PaymentScreenActions.*;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class PaymentScreenTest {

    private WebDriver driver;
    private PaymentScreenPage paymentScreenPage;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
        this.paymentScreenPage = new PaymentScreenPage(driver);
    }

    @Test(dataProvider = "criteria")
    public void paymentScreenTest(Consumer<PaymentScreenPage> consumer) {
            paymentScreenPage.goTo();
            consumer.accept(paymentScreenPage);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

    }

    @DataProvider(name = "criteria")
    public Object[] getData(){
        return new Object[]{
                validCC.andThen(buyNow).andThen(passedSuccess),
                inValidCC.andThen(buyNow).andThen(failed),
                freeCoupon.andThen(buyNow).andThen(passedSuccess),
                discountedCoupon.andThen(validCC).andThen(buyNow).andThen(passedSuccess),
                discountedCoupon.andThen(inValidCC).andThen(buyNow).andThen(failed),
                inValidCC.andThen(buyNow).andThen(failed)
        };
    }

    @AfterTest
    public void quit(){
        this.driver.quit();
    }
}