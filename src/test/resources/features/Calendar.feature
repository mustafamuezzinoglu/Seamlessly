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
    Given the user is logged in
    And   the user navigate to "Calendar" module

  Scenario: Daily calendar view
    Given the user click three dot icon
    When  the user click day icon
    Then  the user can see daily calendar view