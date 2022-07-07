Feature: feature to test login functionality

	@SmokeTest	 
  Scenario: Check login is successful with valid credentials
    Given user is on a login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
