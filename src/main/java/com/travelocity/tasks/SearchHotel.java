package com.travelocity.tasks;

import com.travelocity.interactions.SelectDate;
import com.travelocity.interactions.SelectLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.travelocity.userinterfaces.BookHotelElements.*;

public class SearchHotel implements Task {
    private final List<String> data;

    public SearchHotel(List<String> data) {
        this.data = data;
    }

    public static SearchHotel onPage(List<String> data) {
        return Tasks.instrumented(SearchHotel.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectLocation.toReserveRoom(data.get(0), BTN_GOING_TO, INPUT_REGISTER_LOCATIONS, OPTION_LOCATION),
                Click.on(BTN_CHECK_IN),
                SelectDate.intoCalendar(data.get(1)),
                Click.on(BTN_CHECK_OUT),
                SelectDate.intoCalendar(data.get(2)),
                Click.on(BTN_SEARCH)
        );
    }

}
