Feature: Deck Module Functionality
  As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.



  Acceptance Criteria

  User can create a new board
  User can create a new list of card/task under any board
  User can add a new card/task on any list on the current board
  User can assign any card/task to himself/herself by using the three dots on the related card
  User can move any card on the current board to any other list of other board

  Background:
    Given user login with valid credentials
    And   user navigates to "Deck" module

  @SEAMLES10-614
  Scenario Outline: US-015-TC1 Verify that user can create a new board
    When user opens the navigation menu
    And user clicks on Add board button
    And user enters a "<Board Title>"
    And user clicks on the Right Arrow button or push Enter
    Then user should see a new board with the given name under All Boards Menu
    Examples:
      | Board Title |
      | Office      |
      | Personal    |
      | School      |


  @SEAMLES10-636
  Scenario Outline: US-015-TC2-1 User can create a new list of card/task under any board

    When user is on board page
    And user selects any board from the All boards
    And user enters a "<List Title>" for the selected Board Title
    Then user should see the created list name for

    Examples:
      | List Title |
      | To do      |


  @SEAMLES10-637
  Scenario Outline: US-015-TC2-2 User can add a new list of card/task under any board

    When user is on board page
    And user selects any board from the All boards
    And user click on Add List button
    And user adds a new "<List Title>" for the selected Board Title
    Then user should see the created list name for

    Examples:
      | List Title |
      | Done       |

  @wip
  Scenario Outline: US-015-TC3 User can add a new card/task on any list on the current board

    When user is on current board
    And user clicks on an add card button
    And user passes a "<new card>" name
    Then user verifies that new card appears on the related list

    Examples:
      | new card             |
      | Results are checked  |








