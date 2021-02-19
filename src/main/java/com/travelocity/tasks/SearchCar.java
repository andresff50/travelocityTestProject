package com.travelocity.tasks;

import com.travelocity.interactions.SelectLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.travelocity.userinterfaces.BookHotelElements.BTN_SEARCH;
import static com.travelocity.userinterfaces.RentCarElements.*;

public class SearchCar implements Task {
    private final List<String> data;

    public SearchCar(List<String> data) {
        this.data = data;
    }

    public static SearchCar onPage(List<String> data) {
        return Tasks.instrumented(SearchCar.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CARS),
                SelectLocation.toReserveRoom(data.get(0), BTN_PICK_UP, INPUT_PICK_UP, INPUT_OPTION_PICK_UP),
                Click.on(BTN_SEARCH)
        );
    }
}
