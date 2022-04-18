@activity4

  Feature: Data with test
    Scenario: Login with data parameter
      Given User is on the login page
      When User fills in "admin" and the "password"
      Then Read the page title and confirmation
      And Close the browser
