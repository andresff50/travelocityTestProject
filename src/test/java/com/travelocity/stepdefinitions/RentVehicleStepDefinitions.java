package com.travelocity.stepdefinitions;

import com.travelocity.questions.VerifyRentVehicle;
import com.travelocity.tasks.SearchCar;
import com.travelocity.tasks.SelectCar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RentVehicleStepDefinitions {

    @When("looking for a car as below:")
    public void lookingForACarAsBelow(DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCar.onPage(data));
    }

    @When("select the car")
    public void selectTheCar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCar.forRent());
    }

    @Then("must see the car previously selected")
    public void mustSeeTheCarPreviouslySelected() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyRentVehicle.selected())
        );
    }
}
