package com.travelocity.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.RentCarElements.PRICE_VALIDATE_TOTAL_CAR;

public class VerifyRentVehicle implements Question<Boolean> {

    public static VerifyRentVehicle selected() {
        return new VerifyRentVehicle();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (PRICE_VALIDATE_TOTAL_CAR.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("totalPrice")))
            return true;
        return false;
    }
}
