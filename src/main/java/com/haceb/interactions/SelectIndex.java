package com.haceb.interactions;

import com.haceb.globalVar.Global;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static com.haceb.userinterface.HomeUI.PNL_PRODUCT;

public class SelectIndex implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = PNL_PRODUCT.resolveAllFor(actor);
        Global.checkNameProductItem = listProducts.get(8).getText();
        listProducts.get(8).click();
    }

    public static Performable on() {
        return Instrumented.instanceOf(SelectIndex.class).withProperties();
    }
}
