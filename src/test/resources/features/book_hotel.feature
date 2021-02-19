#language: en
#Author: andresvz50@gmail.com
Feature: As a user I want to book a hotel on the travelocity website

  Background:
    Given that the user open the travelocity website

  @ReserveRoom
  Scenario Outline: book a hotel room
    When looking for a hotel as below:
      | <destination> | <check_in> | <check_out> |
    And book a hotel room
    Then verify that the room was selected

    Examples:
      | destination | check_in     | check_out    |
      | Medellin    | Mar 24, 2021 | Mar 28, 2021 |

  @MaxTravelers
  Scenario: Select the maximum passenger capacity
    When select the option of 12 Adults and 1 children to reserve a room
    Then verify the message "We are only able to book between 1 and 14 travelers. Please adjust the number of travelers for your search."