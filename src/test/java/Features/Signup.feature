Feature: Signup_Functionality
  Scenario: Validate that user can sign up successfully
    Given user is in the login page
    When user enter email as "mohamed7@hendy.com" to create account
    And click create new account
    And user choose his title as "Male"
    And fill firstname as "Mohamed" and lastname as "Hendy" and password as "NewYear!"
    And select the birthday as "23" and birthmonth as "7" and birthyear as "1994"
    And fill the address as "Cairo" and City as "New caior" and postalcode as "11311"
    And select state as "11" and country as "21"
    And enter phone number as "01023818181"
    And click on the signup button
    And click login
    Then app navigate user to MyAccount page

