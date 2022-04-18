@activity2
  Feature: Login Test

    Scenario: test login functionality
      Given User is present on login page
      When User enters the credentials
      Then Read the page title and confirmation message
      And Close the browser