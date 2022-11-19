Feature: Signup_Functionality
  Scenario: Validate that user can Register and place order successfully
    Given user is in the home page
    When user click register
    And user choose his Gender as "Male"
    And fill firstName as "Muhamed" and lastLame as "Hendy"
    And select the birthDay as "19" and birthMonth as "11" and birthYear as "1994"
    And fill email address as "mohamed17@hendy.com"
    And fill the companyName as "VOIS"
    And fill the password as "P@ssw0rd" and the confirmPassword as "P@ssw0rd"
    And click on the Register button
    And user should be logged-in successfully
    And user search for product as "windows 8 Pro" and click search
    And Add the first product to the cart and open the shopping cart
    And agree to the terms of service and click checkout
    And fill the billing address country as "123" and city as "cairo" and address1 as "cairo" and zipcode as "11311" and phone as "01023818181"
    And select the shipping method as "2nd Day Air ($0.00)" then continue
    And Select the paymentMethod and continue to the confirm order section
    And Click confirm to on the order details
    Then user should be navigated to the completed page with order number




