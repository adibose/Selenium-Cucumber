Feature: Test Login functionality


  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is in login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page
    Examples:
    |username|password|
    |aditya|12345|
    |pallabi|12345|
