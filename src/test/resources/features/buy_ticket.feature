#language: en
#Author: andresvz50@gmail.com
Feature: As a user I want to buy a ticket on the travelocity website

  Background:
    Given that the user open the travelocity website

  @BuyTicket
  Scenario Outline: Select roundtrip flight
    When looking for a flight as below:
      | <origin> | <destination> | <departing> | <returning> |
    And select the flight roundtrip
    Then must see the previously selected flights

    Examples:
      | origin | destination | departing   | returning   |
      | Bogota | Medellin    | Tue, Feb 16 | Thu, Feb 18 |