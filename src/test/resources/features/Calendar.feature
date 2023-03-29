@123
Feature: Calendar Module
  User Story :

  As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module

  Acceptance Criteria:

  User can display daily calendar view
  User can display weekly calendar view
  User can display monthly calendar view
  User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
  User can delete any event through the Monthly Calendar view by clicking on the event and then using “more” option

  Background:
    Given user login with valid credentials
    And   the user navigate to "Calendar" module


  Scenario:  User can display daily calendar view
    When User click on the calendar view dropdown menu
    And  User click on "day" option
    Then User should see daily calendar view


  Scenario:  User can display weekly calendar view
    When  User click on the calendar view dropdown menu
    And  User click on "week" option
    Then User should see weekly calendar view


  Scenario:  User can display monthly calendar view
    When  User click on the calendar view dropdown menu
    And  User click on "month" option
    Then User should see monthly calendar view