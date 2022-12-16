package com.haceb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target PNL_PRODUCT_6 = Target.the("product card")
            .locatedBy("(//*[@class='shelve__item'])[6]");

    public static final Target BTN_NEXT = Target.the("next button")
            .locatedBy("//button[@id='slick-slide-control31']");

    public static final Target PNL_PRODUCT = Target.the("product card")
            .locatedBy("//*[@class='shelve__item']");

    public static final Target BTN_CLOSE_MODAL = Target.the("button home modal")
            .locatedBy("//a[@aria-label='close window']");

    public static final Target LBL_HOME = Target.the("label validate home")
            .locatedBy("//span[text()='Electrodomésticos Haceb:']");

    public static final Target IMG_LOGO = Target.the("logo application")
            .locatedBy("//a[@title='Haceb']");
}
