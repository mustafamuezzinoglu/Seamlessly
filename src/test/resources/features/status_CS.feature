@SEAMLES10-600
Feature: status feature

  User Story :
  As a user, I should be able to change my online status and set a status message

  Acceptance Criteria:
  User can view Online Status
  User can change Online Status
  User can set a status message from any default options
  User can set a custom status message with also using any emoji option provided

Background: User login successfully
  Given user login with valid credentials


Scenario: User can view Online Status
  When user click the status module
  And user see the online status options
  Then user should see four status options


  Scenario: User can change Online Status
    When user click the Away status option
    And click the Set status message
    Then user should see to changed the status


    Scenario: User can set a status message from any default options
    When user click any option
      Then user should see a message in placeholder of status message

Scenario: User can set a custom status message
  When user writes the custom message as "<Hello World>"

Then user should see Hello World message






