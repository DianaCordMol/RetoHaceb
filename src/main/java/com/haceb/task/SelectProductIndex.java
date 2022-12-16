package com.haceb.task;

import com.haceb.interactions.GetTextProduct;
import com.haceb.interactions.Refresh;
import com.haceb.interactions.SelectIndex;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.haceb.userinterface.HomeUI.BTN_CLOSE_MODAL;
import static com.haceb.userinterface.ProductUI.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectProductIndex implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Refresh.on(),
                WaitUntil.the(BTN_CLOSE_MODAL, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CLOSE_MODAL),
                SelectIndex.on(),
                WaitUntil.the(LBL_NAME_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                GetTextProduct.on()
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(SelectProductIndex.class).withProperties();
    }
}
