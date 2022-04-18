@activity3
  Feature: Testing with Tags
    Background: User is Logged In
      Given User is on the page


    @SimpleAlert,@SmokeTest
    Scenario: Testing with Tags
    //Given User is on the page
    When User clicks the Simple Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert
    And Close the browser

    @ConfirmAlert
    Scenario: Testing with Confirm Alert
     // Given User is on the page
    When User clicks the Confirm Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert with Cancel
    And Close the browser

    @PromptAlert
    Scenario: Testing with Prompt Alert
    //Given User is on the page
    When User clicks the Prompt Alert button
    Then Alert opens
    And Write a custom message in it
    And Close the alert
    And Close the browser