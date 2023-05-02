Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome Browser
    When User open PhoneBook HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Login button
    Then User verifies SignOut button is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with wrong password
    Given User launches Chrome Browser
    When User open PhoneBook HomePage
    And User clicks on Login link
    And User enters a valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Login button
    Then User verifies Alert is appears
    And User quites browser
    Examples:
      | email              | password    |
      | manuel+4@gmail.com | Manuel12345 |
      | manuel+4@gmail.com | Manuel$     |
      | manuel+4@gmail.com | 12345$      |