package com.travelocity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchWindow implements Interaction {
    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    public static SwitchWindow tab() {
        return Tasks.instrumented(SwitchWindow.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
    }
}
