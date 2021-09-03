package com.java.paymentscreenassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentScreenPage {

    private final WebDriver driver;

    @FindBy(id="coupon")
    private WebElement couponText;

    @FindBy(id="couponbtn")
    private WebElement applyCoupon;

    @FindBy(id="cc")
    private WebElement creditCard;

    @FindBy(id="year")
    private WebElement year;

    @FindBy(id="cvv")
    private WebElement cvv;

    @FindBy(id="buy")
    private WebElement buyNow;

    @FindBy(id="status")
    private WebElement status;

    public PaymentScreenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-payment-screen.html");
    }

    public void applyPromoCode(String promo){
        this.couponText.sendKeys(promo);
        this.applyCoupon.click();
    }

    public void enterCardInfo(String cc, String year,String cvv){
        this.creditCard.sendKeys(cc);
        this.year.sendKeys(year);
        this.cvv.sendKeys(cvv);
    }

    public void clickOnByNow(){
        this.buyNow.click();
    }

    public String getStatus(){
       return this.status.getText();
    }
}