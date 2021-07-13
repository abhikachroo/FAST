@Web
Feature: Web Application Test Scenarios
 
@FirstWeb
Scenario: Add to Cart Functionality
    Given User clicks on Add to Cart button
    When User clicks on Cart Image and Checkout button
    Then validate user is navigated to Cart details page
    
@Second    
Scenario: This is second scenario
    Given Another precondition is given
    When Something is done again
    Then Something is expected again