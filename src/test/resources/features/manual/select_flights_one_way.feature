#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to select a flight one way on the travelocity website

  @manual
  Scenario: select flight one way
    When search a flight leaving from "Bogota" and going to "Medellin" with "One-way"
    And select the flights
    Then verify that the user selected the flight correctly

  @manual
  Scenario: select flight with the most expensive ticket
    When search a flight leaving from "Bogota" and going to "Medellin" with "Roundtrip"
    And select the flights with the most expensive ticket
    Then verify that the user selected the flight correctly