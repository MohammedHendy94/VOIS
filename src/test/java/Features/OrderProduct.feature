Feature: Ordering_Functionality
  Scenario: Validate that logged in user can purchase a women blouse
    Given user is in the login page
    When user enter email as "hendee794@gmail.com" and password as "Hendy@2022"
    And click login
    And click on blouses products from women
    And click on Add to cart
    And click proceed to checkout
    And click proceed to checkout in summary step
    And click proceed to checkout in address step
    And checks the terms of service checkbox
    And Click proceed to checkout in shipping step
    And choose to pay by bank wire option from the payment page
    And click confirm my order from order summary page
    And Get the order details.
    And Go to My Orders Screen
    Then Order should be added to the order history page

