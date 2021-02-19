#language: en
#Author: andresvz50@gmail.com
Feature: As a user I want to rent a vehicle on the travelocity website

  Background:
    Given that the user open the travelocity website

  @RentVehicle
  Scenario Outline: Rent a vehicle
    When looking for a car as below:
      | <pick_up> | <pick_up_date> | <drop_off_date> | <pick_up_time> | <drop_off_time> |
    And select the car
    Then must see the car previously selected

    Examples:
      | pick_up  | pick_up_date | drop_off_date | pick_up_time | drop_off_time |
      | Medellin | Tue, Feb 16  | Thu, Feb 18   | 10:30        | 10:30         |
