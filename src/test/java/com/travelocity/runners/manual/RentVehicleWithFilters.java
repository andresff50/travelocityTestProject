package com.travelocity.runners.manual;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/manual/rent_vehicle_with_filters.feature",
        glue = "com.travelocity.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RentVehicleWithFilters {
}
