Feature: CodersLab portal

  Scenario Outline: Logging into Mystore  portal
    Given User is on "https://mystore-testlab.coderslab.pl/" Page
    Then User click on SignIn button
    Then user enters "<login>" and "<pass>"
    Then User click on Addresses tile
    Then User click on Create button
    Then User fill up the form with "<alias>", "<address>", "<city>", "<zip_code>", "<country>" and "<phone>"
    And User Check if form was filled with legit data "<alias>", "<address>", "<city>", "<zip_code>", "<country>" and "<phone>"
    Then User delete the address and check if successfully deleted


    Examples:
      | login       | pass         | alias | address       | city   | zip_code | country        | phone               |
      | mcz@test.pl | 123456qwerty | Mr    | Chertsey Road | Woking | GU21 4YH | United Kingdom | +44 (0) 1483 261900 |