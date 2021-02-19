package com.travelocity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.travelocity.userinterfaces.BookHotelElements.*;


public class SelectDate implements Interaction {
    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    private final String content;

    public SelectDate(String content) {
        this.content = content;
    }

    public static SelectDate intoCalendar(String content) {
        return Tasks.instrumented(SelectDate.class, content);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement webElement = driver.findElement(By.xpath("//button[contains(@aria-label, '" + content + "')]"));
        webElement.click();
        actor.attemptsTo(Click.on(BTN_DONE_CALENDAR));
    }
}
