package com.travelocity.tasks;

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

public class SelectFlightPageTwo implements Task {

    public static SelectFlightPageTwo roundTrip() {
        return Tasks.instrumented(SelectFlightPageTwo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SELECT_FLIGHT, isEnabled()),
                Click.on(BTN_SELECT_FLIGHT),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(BTN_SELECT_FLIGHT, isEnabled()),
                Click.on(BTN_SELECT_FLIGHT),
                Click.on(BTN_CONTINUE),
                SwitchWindow.tab(),
                WaitUntil.the(TOTAL_PRICE2, isVisible())
        );
        Serenity.setSessionVariable("flightPrice").to(TOTAL_PRICE2.resolveFor(actor).getText());
        actor.attemptsTo(Click.on(CONTINUE_BOOKING2));
    }
}
