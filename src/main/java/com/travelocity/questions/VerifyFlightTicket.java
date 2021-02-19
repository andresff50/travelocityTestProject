package com.travelocity.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.FlightTicketsElements.*;

public class VerifyFlightTicket implements Question<Boolean> {

    public static VerifyFlightTicket selected() {
        return new VerifyFlightTicket();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (TOTAL_FINAL_PRICE.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("flightPrice")))
            return true;
        return false;
    }
}
