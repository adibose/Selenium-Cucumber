Feature: Test Login functionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is in login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username  | password |
      | "pallabi"  | "12345"  |
      | "aditya" | "12345"  |

  @smoke
  Scenario: Check login functionality with invalid credentials
    Given browser is open
    And user is in login page
    When user enters invalid credentials
      | username | password |
      | aditya | 13345  |
    And user clicks on login
    Then user sees an error message
