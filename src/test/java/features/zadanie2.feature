Feature: Coderslab portal zadanie 2

  Scenario Outline: Making a purchase on Mystore Page
    Given Given User is on "https://mystore-testlab.coderslab.pl/" Page
    And User is LoggedIn with "<login>" and "<pass>"
    Then User click on Hummingbird Printed Sweater
    And User select the size M, quantity and add to cart
    Then User go to checkout and finalize the purchase
    And User select Payment Method Pay by Check, click the checkbox and Order
    Then User take a screenshot of the page with confirmation

    Examples:
      | login       | pass         |
      | mcz@test.pl | 123456qwerty |