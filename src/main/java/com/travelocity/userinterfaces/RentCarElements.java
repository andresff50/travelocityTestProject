package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RentCarElements {
    /**
     * Cars search elements
     */
    public static final Target BTN_CARS = Target.the("Btn select first flight").located(By.xpath("//a[@aria-controls='wizard-car-pwa']"));
    public static final Target BTN_PICK_UP = Target.the("Btn select first flight").located(By.xpath("//button[@data-stid='location-field-locn-menu-trigger']"));
    public static final Target INPUT_PICK_UP = Target.the("Btn select first flight").located(By.id("location-field-locn"));
    public static final Target INPUT_OPTION_PICK_UP = Target.the("Btn select first flight").located(By.xpath("//ul[@data-stid='location-field-locn-results']//li"));


    public static final Target OPTION_CAR_RENT = Target.the("Btn select first flight").located(By.xpath("//div[@id='offer-cards-list']//button"));
    public static final Target BUTTON_RESERVE_CAR = Target.the("Btn select first flight").located(By.name("reserve-btn"));

    public static final Target PRICE_TOTAL_RENT_CAR_OP1 = Target.the("Btn select first flight").located(By.xpath("//h3[contains(@class,'uitk-type-right')]"));
    public static final Target PRICE_TOTAL_RENT_CAR_OP2 = Target.the("Btn select first flight").located(By.xpath("//span[@class='total-price']"));
    public static final Target PRICE_VALIDATE_TOTAL_CAR = Target.the("Btn select first flight").located(By.id("hasNoPointsAndDueAtPickUpPrice"));

}
