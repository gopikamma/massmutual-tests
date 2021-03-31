Feature: Verify the total balance is correct based on the values is listed on the screen

Scenario: Verify total balance is equals with sum of values listed on the screen
Given user is on respective page
When fetch total balance
When fetch sum of all the values except total balance
Then sum of all the values and total balance should be equal