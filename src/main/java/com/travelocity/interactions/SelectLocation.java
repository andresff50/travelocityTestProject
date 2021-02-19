package com.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SelectLocation implements Interaction {
    private final String city;
    private final Target button;
    private final Target input;
    private final Target options;

    public SelectLocation(String city, Target button, Target input, Target options) {
        this.city = city;
        this.button = button;
        this.input = input;
        this.options = options;
    }

    public static SelectLocation toReserveRoom(String city, Target button, Target input, Target options) {
        return Tasks.instrumented(SelectLocation.class, city, button, input, options);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(button),
                Enter.theValue(city).into(input),
                WaitUntil.the(options, isVisible()),
                Click.on(options)
        );
    }
}
