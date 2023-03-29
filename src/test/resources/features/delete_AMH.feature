Feature: Deleted Files Tab Functionality

  Background: User logs-in with valid credentials, navigates to All_files page, creates and deletes ex files,
    Given user login with valid credentials
    And user navigates to All_files page
    And user creates and deletes "New Text Delete 1" and "New Text Delete 2" files

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