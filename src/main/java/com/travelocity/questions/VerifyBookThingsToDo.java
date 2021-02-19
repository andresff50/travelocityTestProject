package com.travelocity.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.travelocity.userinterfaces.ThingsToDoElements.SPAN_BOOK_PLACE_THINGS_TO_DO;

public class VerifyBookThingsToDo implements Question<Boolean> {

    public static VerifyBookThingsToDo selected() {
        return new VerifyBookThingsToDo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (SPAN_BOOK_PLACE_THINGS_TO_DO.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("titleThingsToDo")))
            return true;
        return false;
    }
}
