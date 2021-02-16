package com.travelocity.stepdefinitions;

import com.travelocity.userinterfaces.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class BookHotelStepDefinitions {
    @Given("that the user open the travelocity website")
    public void thatTheUserOpenTheTravelocityWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(HomePage.class));
    }

    @When("looking for a hotel as below:")
    public void lookingForAHotelAsBelow(DataTable dataTable) {

    }

    @When("select the room with the lowest price")
    public void selectTheRoomWithTheLowestPrice() {

    }

    @Then("must see the hotel previously selected")
    public void mustSeeTheHotelPreviouslySelected() {

    }
}
