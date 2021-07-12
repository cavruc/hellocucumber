Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page
    Examples:
      | username | password |
      | Vera     | 12345    |
      | Robert   | 12345    |