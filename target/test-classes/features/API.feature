@API
Feature: API Testing
@APIFirst
Scenario: Get the users list from Dummy Site
Given Get the user list
When Request is posted
Then Validate response as 200
