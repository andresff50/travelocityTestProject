package com.travelocity.tasks;

import com.travelocity.interactions.SwitchWindow;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userinterfaces.RentCarElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCar implements Task {

    public static SelectCar forRent() {
        return Tasks.instrumented(SelectCar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPTION_CAR_RENT, isVisible()),
                Click.on(OPTION_CAR_RENT),
                SwitchWindow.tab()
        );
        if (PRICE_TOTAL_RENT_CAR_OP1.resolveFor(actor).isVisible()) {
            Serenity.setSessionVariable("totalPrice").to(PRICE_TOTAL_RENT_CAR_OP1.resolveFor(actor).getText());
        } else {
            Serenity.setSessionVariable("totalPrice").to(PRICE_TOTAL_RENT_CAR_OP2.resolveFor(actor).getText());
        }
        actor.attemptsTo(Click.on(BUTTON_RESERVE_CAR));
    }
}
