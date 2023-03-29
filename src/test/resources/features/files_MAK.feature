Feature: Files module functionalities

  User Story :As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

  Acceptance Criteria:

  1.User can add any file to favorites from its own three dots menu
  2.User can rename any file from its own three dots menu
  3.User can put some comments on any file from the file details menu opened right side
  4.User can delete the comments made on any file from the the file details menu opened right side

  Background:
    Given user login with valid credentials
    And user navigates to "files" module


  Scenario: verify user add any file to favorites from its own three dots menu
    When user clicks on "Readme.md" file three dots button
    And user clicks on remove from favorites button
    And user clicks on favorites tab button
    Then user see starred "Readme" file
