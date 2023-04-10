@SEAMLES10-654
Feature: Deck Module Functionality
  As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.

  Background:
    Given user login with valid credentials
    And   user navigates to "Deck" module


  @SEAMLES10-614
  Scenario Outline: US-015-TC1(a) Verify that user can create a new board
    When user opens the navigation menu
    And user clicks on Add board button
    And user enters a "<Board Title>"
    And user clicks on the Right Arrow button or push Enter
    Then user should see a new board with the given name under All Boards Menu
    Examples:
      | Board Title |
      | Office      |
      | Personal    |

  @SEAMLES10-666
  Scenario: US-015-TC1(b) User verifies that user cannot create a board without a title
  empty
    When user opens the navigation menu
    And user clicks on Add board button
    And user leaves placeholder for adding board empty
    And user clicks on the Right Arrow button or push Enter
    Then user verifies warning board message "Please fill out this field."


  @SEAMLES10-636
  Scenario Outline: US-015-TC2 User can add a new list of card/task under any board
    When user is on board page
    And user selects a "<Board Name>" from the All boards
    And user click on Add List button
    And user adds a new "<List Title>" for the selected Board Title
    Then user should see the created "<List Title>" for

    Examples:
      | Board Name | List Title |
      | Office     | To do      |
      | Office     | Done       |
      | Personal   | To do      |


  @SEAMLES10-637
  Scenario Outline: US-015-TC3 User can add a new card/task on any list on the current board

    When user is on current board
    And user clicks on an add button for "<list>"
    And user passes a "<new card>" name
    Then user verifies that "<new card>" appears on the related list

    Examples:
      | list  | new card             |
      | To do | Birthday celebration |
      | Done  | Results are checked  |


  @SEAMLES10-667
  Scenario: User verifies that user cannot add a list without a title
    When user opens the navigation menu
    And user click on any board
    And user click on Add List button
    And user leaves placeholder for adding list empty
    And user pushes Enter
    Then user verifies warning list message "Please fill out this field."


  @SEAMLES10-652
  Scenario Outline: US-015-TC4 User can assign any card/task to himself/herself by
  using the three
  dots on
  the related card
    When user is on current board
    And user clicks on three dot image of a "<card>"
    And user clicks on "Assign to me" from dropdown menu
    Then user verifies Avatar icon

    Examples:
      | card                |
      | Results are checked |


  @SEAMLES10-653
  Scenario Outline: US-015-TC5 User can move any card on the current board to any other
  list of other board
    When user is on current board
    And user clicks on three dot image of a "<card>"
    And user clicks on "Move card" from dropdown menu
    And user selects "Personal" board from select a board dropdown menu
    And user selects "To do" from select list dropdown menu
    And user clicks on Move card button
    Then user verifies that the "<card>" appears on the related "To do" and "Personal"

    Examples:
      | card                 |
      | Birthday celebration |





