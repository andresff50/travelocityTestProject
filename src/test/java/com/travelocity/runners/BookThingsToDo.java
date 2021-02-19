package com.travelocity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/book_things_to_do.feature",
        glue = "com.travelocity.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BookThingsToDo {
}
