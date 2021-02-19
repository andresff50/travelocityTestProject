package com.travelocity.tasks;

import com.travelocity.interactions.SelectLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.travelocity.userinterfaces.BookHotelElements.BTN_SEARCH;
import static com.travelocity.userinterfaces.ThingsToDoElements.*;

public class SearchTourismActivity implements Task {
    private final String data;

    public SearchTourismActivity(String data) {
        this.data = data;
    }

    public static SearchTourismActivity onPage(String data) {
        return Tasks.instrumented(SearchTourismActivity.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_THINGS_TO_DO),
                SelectLocation.toReserveRoom(data, BTN_THINGS_TO_DO_IN, INPUT_THINGS_TO_DO_IN, INPUT_OPTION_THINGS_TO_DO_IN),
                Click.on(BTN_SEARCH)
        );
    }
}
