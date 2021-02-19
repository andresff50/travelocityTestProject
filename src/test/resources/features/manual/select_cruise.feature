#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to select a cruise on the travelocity website

  @manual
  Scenario: select cruise with the most expensive room
    When search a cruise going to "Bahamas" with 1 adults and 2 children
    And select the first cruise result
    And reserve the most expensive room of the list
    Then verify that the user selected the room correctly

  @manual
  Scenario: book cruise ship rooms with a maximum not allowed
    When search a cruise going to "Bahamas" with 5 adults and 2 children
    Then must see the message "We are only able to book between 1 and 5 travelers. Please adjust the number of travelers for your search."

  @manual
  Scenario: select cruise with OceanView
    When search a cruise going to "Bahamas" with 1 adults and 2 children
    And select the cruise with cabin experience "OceanView"
    Then verify that the user selected the cruise with cabin experience "OceanView"

  @manual
  Scenario: select cruise with Cruise Length
    When search a cruise going to "Bahamas" with 1 adults and 2 children
    And select the cruise with cruise length "6-9 Nights"
    Then verify that the user selected the cruise with with cruise length "6-9 Nights"