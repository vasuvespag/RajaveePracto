Feature: Practo Login
Scenario: Login Successful

Given I am on Practo home page
When I click on Login
And I enter valid Username
And I enter valid Password
And I click on Login button
Then I am successfully logged in


