package com.travelocity.tasks;

import com.travelocity.interactions.SelectAdultsAndChildren;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.travelocity.userinterfaces.BookHotelElements.*;

public class SelectTravelers implements Task {
    private final Integer numberAdults;
    private final Integer numberChildren;

    public SelectTravelers(Integer numberAdults, Integer numberChildren) {
        this.numberAdults = numberAdults;
        this.numberChildren = numberChildren;
    }

    public static SelectTravelers forHotel(Integer numberAdults, Integer numberChildren) {
        return Tasks.instrumented(SelectTravelers.class, numberAdults, numberChildren);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TRAVELERS),
                SelectAdultsAndChildren.toElement(BTN_ADD_ADULTS, numberAdults),
                SelectAdultsAndChildren.toElement(BTN_ADD_CHILDREN, numberChildren)
        );
    }
}
