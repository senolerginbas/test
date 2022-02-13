@user_creation
  Feature: creating new user feature

    Scenario: login_as_admin

      Given user is on the login page
      And user clicks on login dropdown
      And user clicks on sign in button
      And user enters admin_id and admin_password
        |admin_username|admin_password|
        |  CWoburn    |Cw192837?     |

      And user clicks on the login button
    Scenario Outline: create_new_user
      Given admin clicks user management
      And admin clicks the button to create a user
      And admin enters "<login>" for login
      And admin enters "<firstname>" for firstname and "<lastname>" for lastname
      And admin enters "<email>" as email address
      #And admin clicks the activated box
      And admin selects the language
      And admin selects the profile
      And user clicks Save button

      Examples:
        |   login | firstname    | lastname|email|
        | lo106   | mehmyavu1   | dolapere|dolapee21@gmail.com|