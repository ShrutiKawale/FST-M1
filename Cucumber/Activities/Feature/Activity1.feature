@activity1
Feature:First test

  Scenario: open web page using selenium
    Given A user is on google home page
    When User types in cheese and hits enter
    Then Count in number of search results shown
    And Close the browser