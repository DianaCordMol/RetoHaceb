package com.haceb.task;

import com.haceb.interactions.BackNavigate;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.haceb.userinterface.ProductUI.BTN_BUY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_BUY, isVisible()).forNoMoreThan(20).seconds(),
                Check.whether(WebElementQuestion.stateOf(BTN_BUY),
                        WebElementStateMatchers.isVisible()).andIfSo(
                        BackNavigate.on()
                ));
    }

    public static Performable on() {
        return Instrumented.instanceOf(ValidateCart.class).withProperties();
    }
}
