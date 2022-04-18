@activity5
Feature: Data with test params

  Scenario Outline: Login with data parameter from file
    Given User is on the login page
    When User fills in "<usernames>" and the "<passwords>"
    Then Read the page title and confirmation
    And Close the browser
    Examples:
      | usernames | passwords |
      | admin     | password  |
      | admin | password  |
