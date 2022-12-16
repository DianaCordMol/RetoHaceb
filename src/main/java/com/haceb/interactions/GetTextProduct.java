package com.haceb.interactions;

import com.haceb.globalVar.Global;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static com.haceb.userinterface.ProductUI.LBL_NAME_PRODUCT;

public class GetTextProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Global.checkNameProduct = LBL_NAME_PRODUCT.resolveFor(actor).getText();
    }

    public static Performable on(){

        return Instrumented.instanceOf(GetTextProduct.class).withProperties();
    }
}
