package com.haceb.task;

import com.haceb.interactions.ClickRandom;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import static com.haceb.userinterface.HomeUI.*;

public class SelectProductRandom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CLOSE_MODAL, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CLOSE_MODAL),
                WaitUntil.the(PNL_PRODUCT_6, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(PNL_PRODUCT_6),
                ClickRandom.on()
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(SelectProductRandom.class).withProperties();
    }
}
