package com.haceb.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.haceb.userinterface.HomeUI.*;

public class ValidateLogo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(WebElementQuestion.stateOf(IMG_LOGO),
                WebElementStateMatchers.isVisible()));
    }

    public static Performable on() {
        return Instrumented.instanceOf(ValidateLogo.class).withProperties();
    }
}
