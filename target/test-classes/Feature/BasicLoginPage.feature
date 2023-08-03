Feature: To test basic login page

  Scenario Outline: Validate login credentials
    Given Login Page
    And user is on login page
    When user enters <username> and <password>
    And enters password
    Then user is navigated to Example page

    Examples: 
      | username | password |
      | Deepak   | 12345    | 
      | Raju     | 12345    |
