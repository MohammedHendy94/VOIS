Feature: Login_Scenario
  Scenario: Validate that user can go to signup page
    Given user is in the login page
    When user enter email as "mohamed1@hendy.com" to create account
    And click create new account
    Then app navigate user to the Registration screen

  Scenario Outline: Validate that user can't go to signup page with existing or invalid email
    Given user is in the login page
    When user enter email as "<email>" to create account
    And click create new account
    Then app keep user in the login page
    Examples:
      | email                  |
      | hendee794@gmail.com    |
      | w@www                  |

  Scenario: Validate that user can login successfully
    Given user is in the login page
    When user enter email as "hendee794@gmail.com" and password as "Hendy@2022"
    And click login
    Then app navigate user to MyAccount page

  Scenario Outline: checking the login functionality with invalid credentials
    Given user is in the login page
    When user enter email as "<email>" and password as "<password>"
    And click login
    Then AUTHENTICATION Alert should be displayed
    Examples:
      | email                         | password
      | hendee794@gmail.com           | wrongpass
      | w@www                         | 12345
      | -2                            | a@a.com