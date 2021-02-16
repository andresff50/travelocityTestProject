#language: en
#Author: andresvz50@gmail.com
Feature: As a user I want to book a hotel on the travelocity website

  Background:
    Given that the user open the travelocity website

  @ReserveRoomWithLowPrice
  Scenario Outline: Book a room with the lowest price
    When looking for a hotel as below:
      | destination   | check_in   | check_out   | adults   | children   |
      | <destination> | <check_in> | <check_out> | <adults> | <children> |
    And select the room with the lowest price
    Then must see the hotel previously selected

    Examples:
      | destination | check_in    | check_out   | adults | children |
      | Bogota      | Tue, Feb 16 | Thu, Feb 18 | 3      | 1        |