package com.travelocity.stepdefinitions;

import com.travelocity.questions.VerifyBookThingsToDo;
import com.travelocity.tasks.SearchTourismActivity;
import com.travelocity.tasks.SelectTourismActivity;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BookThingsToDoStepDefinitions {

    @When("looking for a tourism activity in {string}")
    public void lookingForATourismActivityIn(String data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTourismActivity.onPage(data));
    }


    @When("select the tourism activity")
    public void selectTheTourismActivity() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTourismActivity.forBook());
    }

    @Then("must see the tourism activity previously selected")
    public void mustSeeTheTourismActivityPreviouslySelected() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerifyBookThingsToDo.selected())
        );
    }
}
