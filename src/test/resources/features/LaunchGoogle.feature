
  Feature: Launch google and search text
      Scenario Outline: : test
      Given user launches the google "https://www.google.com/"
      When I enter the text "<text>"
      Then Click on the 1st Link contains "<text>"
      Examples:
        | text |
        | Selenium  |
        | java  |




