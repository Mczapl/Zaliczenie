Feature: CodersLab portal

  Scenario Outline: Logging into Mystore  portal
    Given User is on "https://mystore-testlab.coderslab.pl/" Page
    Then User click on SignIn button
    Then user enters "<login>" and "<pass>"
    Then User click on Addresses tile
    Then User click on Create button
    Then User fill up the form with "<alias>", "<address>", "<city>", "<zip_code>", "<country>" and "<phone>"


    Examples:
      | login       | pass         | alias | address     | city     | zip_code | country | phone       |
      | mcz@test.pl | 123456qwerty | Mr   | Wolnosci 55 | Warszawa | 00-100   | Polska  | 600-000-001 |