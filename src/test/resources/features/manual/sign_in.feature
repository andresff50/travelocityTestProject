#language: en
#Author: andresvz50@gmail.com

Feature: As a user I want to Sign In on the travelocity website

  @Manual
  Scenario: Sign In
    When sign in with email "example@gmail.com" and password "12345"
    Then the user logged in to the site