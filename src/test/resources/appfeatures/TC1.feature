Feature: verify right count of values appear on the screen

Scenario: verify the right count of values appear on the screen
Given user is on respective page
When fetch all the respective text values
Then all the appeared values should matched right count