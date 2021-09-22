@Web
Feature: Web Application Test Scenarios
 
@FirstWeb
Scenario: Add to Cart Functionality
    Given User searches the medicine
    When User clicks on Add to Card Button
    Then Validate user is navigated to Cart details page
    And Remove cart items
    
