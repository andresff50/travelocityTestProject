package com.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.travelocity.userinterfaces.FlightTicketsElements.BTN_NO_THANKS_ALERT;

public class ClickOnButtonAlert implements Interaction {

    public static ClickOnButtonAlert bookHotel() {
        return Tasks.instrumented(ClickOnButtonAlert.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (BTN_NO_THANKS_ALERT.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Click.on(BTN_NO_THANKS_ALERT));
        }
    }
}
