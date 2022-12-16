package com.haceb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductUI {

    public static final Target BTN_BUY = Target.the("buy button")
            .locatedBy("//*[@class='product__buy flex']/child::a");

    public static final Target LBL_NAME_PRODUCT = Target.the("product name")
            .locatedBy("//h1[@class='product__name visible-only-desktop']");
}
