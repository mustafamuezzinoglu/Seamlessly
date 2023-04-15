
Feature: Seamlessly Smoke Test

  @SEAMLES10-363  #smoke
  Scenario: AC1-TC1- Verify that user can login with valid credentials by clicking login button
    When user writes valid username
    And user writes valid password
    And user clicks login button
    Then user sees dashboard