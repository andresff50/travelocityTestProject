package com.travelocity.tasks;

import com.travelocity.interactions.SwitchWindow;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.BookHotelElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectHotel implements Task {

    public static SelectHotel withLowestPrice() {
        return Tasks.instrumented(SelectHotel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPTION_HOTEL, isVisible()),
                Click.on(OPTION_HOTEL),
                SwitchWindow.tab()
        );
        Serenity.setSessionVariable("titleHotel").to(TITLE_HOTEL.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_RESERVE_A_ROOM),
                WaitUntil.the(BTN_RESERVE_FIRST_ROOM, isEnabled()),
                Click.on(BTN_RESERVE_FIRST_ROOM)
        );
    }
}
