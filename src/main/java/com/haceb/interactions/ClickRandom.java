package com.haceb.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.haceb.userinterface.HomeUI.*;

public class ClickRandom implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
       List<WebElementFacade> listProducts = PNL_PRODUCT.resolveAllFor(actor);
        Random random  = new Random();
        int randomNumber = random.nextInt((listProducts.size()-7) - 5) + 5;

        if(randomNumber > 9) {
            BTN_NEXT.resolveFor(actor).click();
        }
        listProducts.get(randomNumber).waitUntilVisible();
        listProducts.get(randomNumber).click();
    }

    public static Performable on(){

        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }
}
