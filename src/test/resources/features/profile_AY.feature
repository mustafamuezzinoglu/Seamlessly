Feature:Profile Settings

  User Story :

  As a user, I should be able to change profile info settings under the Profile module

  Acceptance Criteria:
  User can see at least following titles inside personal info under Profile Settings page;=>Full name/Email/Phone Number
  User can change "Full name" info under Profile Settings page
  User can make "Phone number" info as private under Profile Settings page
  User can see the current local time under the Local dropdown

    Background: login
    Given user login with valid credentials

    @SEAMLES10-630
    Scenario:User can see Full name/Email/Phone Number titles inside personal info under Profile Settings page
    When user navigates the profile menu
    And user sees "Full name" in the profile page
    And user sees "Email" in the profile page
    And user sees "Phone Number" in the profile page
    Then user should see change profile button in the profile page

  @SEAMLES10-631
    Scenario: User can change "Full name" info under Profile Settings page
      When user opens the profile menu
      And user changes "Profile Name" in the profile page
      Then user should see changed "Profile Name"  in the profile page











