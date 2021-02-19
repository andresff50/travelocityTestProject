#language: en
#Author: andresvz50@gmail.com
Feature: As a user I want to book a tourism activity on the travelocity website

  Background:
    Given that the user open the travelocity website

  @ReserveRoomWithLowPrice
  Scenario: Book the tourism activity
    When looking for a tourism activity in "Medellin"
    And select the tourism activity
    Then must see the tourism activity previously selected