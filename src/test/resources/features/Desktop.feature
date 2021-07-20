
Feature: Desktop feature

@Desktop
Scenario: Notepad Validations
    Given User cliked Help in Notepad app
    When User enters current date in Notepad
    Then Validate Notepad

    