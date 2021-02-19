package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThingsToDoElements {
    /**
     * Things to do elements
     */
    public static final Target BTN_THINGS_TO_DO = Target.the("Btn select first flight").located(By.xpath("//a[@aria-controls='wizard-lx-pwa']"));
    public static final Target BTN_THINGS_TO_DO_IN = Target.the("Btn select first flight").located(By.xpath("//button[@data-stid='location-field-location-menu-trigger']"));
    public static final Target INPUT_THINGS_TO_DO_IN = Target.the("Btn select first flight").located(By.id("location-field-location"));
    public static final Target INPUT_OPTION_THINGS_TO_DO_IN = Target.the("Btn select first flight").located(By.xpath("//ul[@data-stid='location-field-location-results']//li"));

    public static final Target OPTION_THINGS_TO_DO = Target.the("Btn select first flight").located(By.xpath("//section[@id='activity-list-0']//div[@data-testid='activity-spanned-tile-card']//a"));
    public static final Target BTN_SEE_TICKETS = Target.the("Btn select first flight").located(By.xpath("//button[@type='button'][contains(.,'See tickets')]"));
    public static final Target BTN_BOOK_THINGS_TO_DO = Target.the("Btn select first flight").located(By.xpath("//button[contains(@aria-label,'Book')]"));

    public static final Target TITLE_PLACE_THINGS_TO_DO = Target.the("Btn select first flight").located(By.xpath("//header[@data-testid='activity-overview--header']//h1"));
    public static final Target SPAN_BOOK_PLACE_THINGS_TO_DO = Target.the("Btn select first flight").located(By.xpath("//span[@class='activity-title']"));

}
