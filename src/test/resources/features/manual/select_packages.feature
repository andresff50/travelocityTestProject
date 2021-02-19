#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to select packages on the travelocity website

  @manual
  Scenario: select Packages
    When search a packages leaving from "Bogota" and going to "Medellin"
    And reserve the room
    And select the flights
    Then verify that the user selected the hotel and flights correctly