

@SEAMLES10-464
Feature: Logout functionality

  User Story :

  As a user, I should be able to log out.

  Acceptance Criteria:

  1-User can log out and ends up in login page
  2-User can not go to home page again by clicking step back button after successfully logged out.

  Background: User is on the dashboard
  Given user is on the login page
    When user can write valid username
    And user can write valid password
    And user can click login button
    Then user can see dashboard
    @SEAMLES10-463
  Scenario: User can log out and ends up in login page
    When user can click the user avatar scrolldown area
    And user can click the Log out button
    Then user can log out
@SEAMLES10-465
    Scenario: user can not go to home page again by clicking step back button after successfully logged out
      When user can click the user avatar scrolldown area
      And user can click the Log out button
      And user can log out
      And user can click to step back button
      Then user cannot go to home page again

