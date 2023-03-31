Feature: tasks module feature

  User Story :

  As a user, I should be able to create a new task list or a single task and add any task to completed and importants tasks list.

  Acceptance Criteria:

  User can create a new list of tasks**
  User can create a new task
  User can add any task to the list of completed tasks by clicking on the checkbox near the task name
  User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
  User can see the number of all uncompleted tasks next to the Current tab

  Background: login
    Given user login with valid credentials
    When user navigates to "tasks" module

  Scenario: User can create a new list of tasks with "ENTER" key
    When user clicks Add List…
    And user writes the list name "Test List" and presses ENTER key
    And verify that user sees this name inside the list name list

  Scenario: User can create a new list of tasks by clicking save button
    When user clicks Add List…
    And user writes the list name "Test List"
    And user clicks Save button
    And verify that user sees this name inside the list name list

