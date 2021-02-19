package com.travelocity.tasks;

import com.travelocity.interactions.SelectLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.travelocity.userinterfaces.BookHotelElements.BTN_SEARCH;
import static com.travelocity.userinterfaces.FlightTicketsElements.*;

public class SearchFlight implements Task {
    private final List<String> data;

    public SearchFlight(List<String> data) {
        this.data = data;
    }

    public static SearchFlight onPage(List<String> data) {
        return Tasks.instrumented(SearchFlight.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FLIGHT),
                SelectLocation.toReserveRoom(data.get(0), BTN_ORIGIN, INPUT_ORIGIN, OPTION_ORIGIN),
                SelectLocation.toReserveRoom(data.get(1), BTN_DESTINATION, INPUT_DESTINATION, OPTION_DESTINATION),
                Click.on(BTN_SEARCH)
        );
    }


}
