@smoke
  Feature: Seamlessly Smoke Test

    Background: user is on the Files module
      Given user login with valid credentials

    #UPLOAD MODULE
    @wipp @SEAMLES10-650 #ac5
    Scenario: User can see the total number of files and folders under the files list table
      And user navigates to "files" module
      When user upload "selenium notlarim" with ".txt"
      And  user create a "muezzinoglu" folder
      Then user should see the all number of under the files list table
      And delete "selenium notlarim" with extension ".txt"
      And delete "muezzinoglu" with extension ""
