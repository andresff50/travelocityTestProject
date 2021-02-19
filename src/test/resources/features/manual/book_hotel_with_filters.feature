#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to book a hotel on the travelocity website

  @manual
  Scenario: select a 5 star hotel
    When looking for a hotel in "Medellin"
    And select the hotel with 5 start
    Then verify that the user selected the hotel correctly

  @manual
  Scenario: select hotel with Family friendly filter
    When looking for a hotel in "Medellin"
    And select the hotel Family friendly filter
    Then verify that the user selected the hotel correctly

  @manual
  Scenario: select the hotel with the highest score
    When looking for a hotel in "Medellin"
    And select the hotel with the highest score
    Then verify that the user selected the hotel correctly

  @manual
  Scenario: add a hotel to favorites
    When looking for a hotel in "Medellin"
    And add the first result to favorites
    Then verify that the hotel has been added to favorites