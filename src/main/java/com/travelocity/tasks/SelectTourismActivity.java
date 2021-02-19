package com.travelocity.tasks;

import com.travelocity.interactions.SwitchWindow;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.travelocity.userinterfaces.ThingsToDoElements.*;

public class SelectTourismActivity implements Task {

    public static SelectTourismActivity forBook() {
        return Tasks.instrumented(SelectTourismActivity.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_THINGS_TO_DO),
                SwitchWindow.tab()
        );
        Serenity.setSessionVariable("titleThingsToDo").to(TITLE_PLACE_THINGS_TO_DO.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_SEE_TICKETS),
                Click.on(BTN_BOOK_THINGS_TO_DO)
        );
    }
}
