#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to select a tourism activity on the travelocity website

  @manual
  Scenario: select tourism activity with the most expensive price
    When search a tourism activity going to "Santa marta"
    And select the most expensive tourism activity
    Then verify that the user selected the tourism activity correctly

