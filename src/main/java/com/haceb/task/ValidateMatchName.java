package com.haceb.task;

import com.haceb.globalVar.Global;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;

public class ValidateMatchName implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(Global.checkNameProductItem.contains(Global.checkNameProduct)));
    }

    public static Performable on() {
        return Instrumented.instanceOf(ValidateMatchName.class).withProperties();
    }

}
