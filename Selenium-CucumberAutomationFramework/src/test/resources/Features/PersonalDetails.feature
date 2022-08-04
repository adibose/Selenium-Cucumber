Feature: Entering personal details

  Scenario: using default payment option
    Given I'm a user
    And my personal details are
      | Country | Address | Email            | Phone      |
      | India   | Kolkata | abc123@gmail.com | 8333444555 |
    When I logged into my application
    And I provide the details
    And I clicked on Save
    Then I should see saved message on Screen
