package com.travelocity.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.BookHotelElements.SPAN_NAME_HOTEL;

public class VerifyRoom implements Question<Boolean> {

    public static VerifyRoom reserved() {
        return new VerifyRoom();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (SPAN_NAME_HOTEL.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("titleHotel")))
            return true;
        return false;
    }
}
