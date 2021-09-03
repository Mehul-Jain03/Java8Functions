package com.java.paymentscreenassignment;

import org.testng.Assert;

import java.util.function.Consumer;

public class PaymentScreenActions {

    public static final Consumer<PaymentScreenPage> freeCoupon = (p) -> p.applyPromoCode("FREEUDEMY");
    public static final Consumer<PaymentScreenPage> discountedCoupon = (p) -> p.applyPromoCode("PARTIALUDEMY");
    public static final Consumer<PaymentScreenPage> validCC = (p) -> p.enterCardInfo("4111111111111111","2023","123");
    public static final Consumer<PaymentScreenPage> inValidCC = (p) -> p.enterCardInfo("4111111111111112","2023","123");
    public static final Consumer<PaymentScreenPage> buyNow = (p) -> p.clickOnByNow();
    public static final Consumer<PaymentScreenPage> passedSuccess = (p) -> Assert.assertEquals(p.getStatus(),"PASS");
    public static final Consumer<PaymentScreenPage> failed = (p) -> Assert.assertEquals(p.getStatus(),"FAIL");

}
