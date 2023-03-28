@SEAMLES10-593 #user story

Feature: seamlessly upload function
"""
   As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Acceptance Criteria:

  User can upload a file
  User can create a new folder
  User can move or copy any selected item to any folder
  User can delete any selected item from its three dots menu
  User can see the total number of files and folders under the files list table
"""

  Background: user is on the Files module
    Given user login with valid credentials
    Given user navigate to "Files" module

  @mm
  Scenario:  User can upload a file
    When user clicks the + button
    And user clicks the uploadFile link
