package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookHotelElements {
    /**
     * Hotels search elements
     */
    public static final Target BTN_GOING_TO = Target.the("Going to button").located(By.xpath("//button[@aria-label='Going to']"));
    public static final Target BTN_CHECK_IN = Target.the("Check-in Calendar").located(By.id("d1-btn"));
    public static final Target BTN_CHECK_OUT = Target.the("Check-out Calendar").located(By.id("d2-btn"));
    public static final Target BTN_TRAVELERS = Target.the("Btn travelers").located(By.xpath("//button[@data-testid='travelers-field-trigger']"));

    public static final Target BTN_ADD_ADULTS = Target.the("Register adults").located(By.xpath("(//div[@data-testid='room-1']//button)[2]"));
    public static final Target BTN_ADD_CHILDREN = Target.the("Register children").located(By.xpath("(//div[@data-testid='room-1']//button)[4]"));

    public static final Target BTN_SEARCH = Target.the("Btn travelers done").located(By.xpath("//button[@data-testid='submit-button']"));

    public static final Target INPUT_REGISTER_LOCATIONS = Target.the("Input where are you going?").located(By.id("location-field-destination"));
    public static final Target OPTION_LOCATION = Target.the("First value Input location result").located(By.xpath("//ul[@data-stid='location-field-destination-results']//li"));

    public static final Target BTN_DONE_CALENDAR = Target.the("Btn Done into calendar element").located(By.xpath("//button[@data-stid='apply-date-picker']"));


    public static final Target OPTION_HOTEL = Target.the("First value hotel result").located(By.xpath("//section[@data-stid='section-results']//a"));

    public static final Target BTN_RESERVE_A_ROOM = Target.the("Btn reserve a room").located(By.xpath("//button[contains(@data-stid,'sticky-button')]"));
    public static final Target BTN_RESERVE_FIRST_ROOM = Target.the("Btn reserve first a room").located(By.xpath("(//button[@data-stid='submit-hotel-reserve'])[2]"));


    public static final Target TITLE_HOTEL = Target.the("Title hotel").located(By.xpath("//h1[contains(@class,'uitk-type-display-700')]"));
    public static final Target SPAN_NAME_HOTEL = Target.the("Title hotel").located(By.xpath("//span[contains(@class,'hotel-summary-name')]"));


    /**
     * Mensajes de error
     */
    public static final Target MAX_TRAVELERS = Target.the("Btn select first flight").located(By.xpath("//div[@data-testid='lob-error-summary']//h3"));

}
