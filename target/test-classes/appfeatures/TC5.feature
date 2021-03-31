Feature: Verify the total balance matches the sum of the values

Scenario: Verify the total balance matches the sum of the values
Given user is on respective page
When fetch total balance
When fetch sum of all the values 
Then total balance should matches sum of all the values
