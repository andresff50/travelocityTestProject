package com.travelocity.tasks;

import com.travelocity.interactions.ClickOnButtonAlert;
import com.travelocity.interactions.SwitchWindow;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.FlightTicketsElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFlightPageOne implements Task {

    public static SelectFlightPageOne roundTrip() {
        return Tasks.instrumented(SelectFlightPageOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SELECT_FLIGHT2, isEnabled()),
                Click.on(BTN_SELECT_FLIGHT2),
                WaitUntil.the(BTN_SELECT_FLIGHT2, isEnabled()),
                Click.on(BTN_SELECT_FLIGHT2),
                ClickOnButtonAlert.bookHotel(),
                SwitchWindow.tab(),
                WaitUntil.the(TOTAL_PRICE, isVisible())
        );
        Serenity.setSessionVariable("flightPrice").to(TOTAL_PRICE.resolveFor(actor).getText());
        actor.attemptsTo(Click.on(CONTINUE_BOOKING));
    }
}
