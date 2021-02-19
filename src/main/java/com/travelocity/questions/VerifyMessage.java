package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.BookHotelElements.MAX_TRAVELERS;

public class VerifyMessage implements Question<Boolean> {
    private final String message;

    public VerifyMessage(String message) {
        this.message = message;
    }

    public static VerifyMessage maxTravelers(String message) {
        return new VerifyMessage(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (MAX_TRAVELERS.resolveFor(actor).getText().equals(message))
            return true;
        return false;
    }
}
