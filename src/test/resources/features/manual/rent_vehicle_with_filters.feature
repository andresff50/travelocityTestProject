#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to rent a car on the travelocity website

  @manual
  Scenario: rent a manual car
    When looking for a car in "Medellin"
    And select the car with the filter "manual car"
    Then verify that the user selected the car correctly

  @manual
  Scenario: rent a compact
    When looking for a car in "Medellin"
    And select the car with the filter Car type "Compact"
    Then verify that the user selected the car correctly