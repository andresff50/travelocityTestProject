package com.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.travelocity.userinterfaces.FlightTicketsElements.BTN_SELECT_FLIGHT2;

public class SelectFlight implements Task {

    public static SelectFlight roundTrip() {
        return Tasks.instrumented(SelectFlight.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (BTN_SELECT_FLIGHT2.resolveFor(actor).isVisible()) {
            actor.attemptsTo(SelectFlightPageOne.roundTrip());
        } else {
            actor.attemptsTo(SelectFlightPageTwo.roundTrip());
        }
    }
}
