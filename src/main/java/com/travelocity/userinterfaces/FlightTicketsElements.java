package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightTicketsElements {
    /**
     * Flight search elements
     */
    public static final Target BTN_FLIGHT = Target.the("Btn Flight").located(By.xpath("//a[contains(@aria-controls,'wizard-flight-pwa')]"));
    public static final Target BTN_ORIGIN = Target.the("Btn origin").located(By.xpath("//button[contains(@data-stid,'location-field-leg1-origin-menu-trigger')]"));
    public static final Target INPUT_ORIGIN = Target.the("Input origin").located(By.id("location-field-leg1-origin"));
    public static final Target OPTION_ORIGIN = Target.the("List of result").located(By.xpath("//ul[@data-stid='location-field-leg1-origin-results']//li"));

    public static final Target BTN_DESTINATION = Target.the("Btn destination").located(By.xpath("//button[contains(@data-stid,'location-field-leg1-destination-menu-trigger')]"));
    public static final Target INPUT_DESTINATION = Target.the("Input destination").located(By.id("location-field-leg1-destination"));
    public static final Target OPTION_DESTINATION = Target.the("List of result").located(By.xpath("//ul[@data-stid='location-field-leg1-destination-results']//li"));

    public static final Target BTN_SELECT_FLIGHT = Target.the("Btn select first flight").located(By.xpath("//ol[@id='flightModuleList']//div[@data-test-id='intersection-observer']"));
    public static final Target BTN_SELECT_FLIGHT2 = Target.the("Btn select first flight").located(By.xpath("//ul[@id='flightModuleList']//button"));
    public static final Target BTN_CONTINUE = Target.the("Btn select first flight").located(By.xpath("//button[@data-test-id='select-button']"));

    public static final Target BTN_NO_THANKS_ALERT = Target.the("Btn select first flight").located(By.xpath("//a[@data-test-id='forcedChoiceNoThanks']"));

    public static final Target CONTINUE_BOOKING = Target.the("Btn select first flight").located(By.id("bookButton"));
    public static final Target CONTINUE_BOOKING2 = Target.the("Btn select first flight").located(By.xpath("//button[@data-test-id='goto-checkout-button']"));

    public static final Target TOTAL_PRICE = Target.the("Btn select first flight").located(By.xpath("(//span[@class='packagePriceTotal'])[2]"));
    public static final Target TOTAL_PRICE2 = Target.the("Btn select first flight").located(By.xpath("(//table[@data-test-id='trip-total']//span)[2]"));
    public static final Target TOTAL_FINAL_PRICE = Target.the("Btn select first flight").located(By.id("totalPriceForTrip"));
}
