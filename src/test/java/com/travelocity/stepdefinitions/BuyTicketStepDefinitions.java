package com.travelocity.stepdefinitions;

import com.travelocity.questions.VerifyFlightTicket;
import com.travelocity.tasks.SearchFlight;
import com.travelocity.tasks.SelectFlight;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BuyTicketStepDefinitions {

    @When("looking for a flight as below:")
    public void lookingForAFlightAsBelow(DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFlight.onPage(data));
    }

    @When("select the flight roundtrip")
    public void selectTheFlightRoundtrip() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectFlight.roundTrip());
    }

    @Then("must see the previously selected flights")
    public void mustSeeThePreviouslySelectedFlights() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyFlightTicket.selected())
        );
    }

}
