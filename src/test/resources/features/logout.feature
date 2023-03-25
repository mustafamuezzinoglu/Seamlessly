

@SEAMLES10-464
Feature: Logout functionality

  User Story :

  As a user, I should be able to log out.

  Acceptance Criteria:

  1-User can log out and ends up in login page
  2-User can not go to home page again by clicking step back button after successfully logged out.

  Background: User is on the dashboard
  Given user is on the login page
    When user writes valid username
    And user writes valid password
    And user clicks login button
    Then user sees dashboard
    @SEAMLES10-463
  Scenario: User can log out and ends up in login page
    When user clicks the user avatar scrolldown area
    And user clicks the Log out button
    Then user logs out
@SEAMLES10-465
    Scenario: user can not go to home page again by clicking step back button after successfully logged out
      When user clicks the user avatar scrolldown area
      And user clicks the Log out button
      And user logs out
      And user clicks to step back button
      Then user cannot go to home page again

