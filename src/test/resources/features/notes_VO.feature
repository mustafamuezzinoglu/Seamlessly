
Feature: notes module feature

  Background: login
    Given user login with valid credentials
    When user navigates to "notes" module

  @wip
  Scenario: verify that user can create a new note
    When user click the plus sign
    And user write notes to note area
    Then user should see the new note title at the left console




