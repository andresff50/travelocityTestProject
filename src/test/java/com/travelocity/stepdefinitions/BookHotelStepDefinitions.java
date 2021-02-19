package com.travelocity.stepdefinitions;

import com.travelocity.questions.VerifyMessage;
import com.travelocity.questions.VerifyRoom;
import com.travelocity.tasks.SearchHotel;
import com.travelocity.tasks.SelectHotel;
import com.travelocity.tasks.SelectTravelers;
import com.travelocity.userinterfaces.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BookHotelStepDefinitions {
    @Given("that the user open the travelocity website")
    public void thatTheUserOpenTheTravelocityWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(HomePage.class));
    }

    @When("looking for a hotel as below:")
    public void lookingForAHotelAsBelow(DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().attemptsTo(SearchHotel.onPage(data));
    }

    @When("book a hotel room")
    public void bookHotelRoom() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectHotel.withLowestPrice());
    }

    @Then("verify that the room was selected")
    public void verifyThatTheRoomWasSelected() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyRoom.reserved())
        );
    }

    /**
     * Scenario @MaxTraveler
     *
     * @param numberAdults
     * @param numberChildren
     */
    @When("select the option of {int} Adults and {int} children to reserve a room")
    public void selectAdultsAndChildrenToReserveRoom(Integer numberAdults, Integer numberChildren) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTravelers.forHotel(numberAdults, numberChildren));
    }

    @Then("verify the message {string}")
    public void verifyTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyMessage.maxTravelers(message))
        );
    }

}
