Feature: Change Profile Info Settings

  User Story :

  As a user, I should be able to change profile info settings under the Profile module

  Acceptance Criteria:
  User can see at least following titles inside personal info under Profile Settings page;=>Full name/Email/Phone Number
  User can change "Full name" info under Profile Settings page
  User can make "Phone number" info as private under Profile Settings page
  User can see the current local time under the Local dropdown

  @SEAMLES10-630
  Background:User is on the dashboard
    Scenario:User can see Full name/Email/Phone Number titles inside personal info under Profile Settings page
    Given user login with valid credentials
    When user navigates the profile menu
    And user sees "Full name" in the profile page
    And user sees "Email" in the profile page
    And user sees "Phone Number" in the profile page
    Then user should see change profile button in the profile page

  Scenario: User can see the most recent deleted file in the first line of
  the deleted file list when deleted files are ordered by newest to oldest

    When user switches to Deleted_Files tab
    And user sorts deleted files by newest to oldest
    Then verify that user can see the last deleted "New Text Delete 2" file in the first line of the deleted file list

  Scenario: User can order the all deleted files by newest to oldest or visa versa

    When user switches to Deleted_Files tab
    And user sorts deleted files by newest to oldest
    Then verify that user is be able to order all the deleted files by newest to oldest or visa versa

  Scenario: User can order alphabetically all the deleted files based on their names

    When user switches to Deleted_Files tab
    And user sorts deleted files based on their names
    Then verify that user is be able to view all the deleted files based on the names sorted alphabetically

  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line

    When user switches to Deleted_Files tab
    And user selects "New Text Delete 1" file
    And User click to three dots button
    Then Verify that user is be able to delete any deleted file permanently

  Scenario: User can restore any deleted file and see it again under the All Files tab

    When user switches to Deleted_Files tab
    And user selects "New Text Delete 2" file
    And user click to three dots button
    Then Verify that user is be able to restore the deleted "New Text Delete 2" file and see it again under the All files tab