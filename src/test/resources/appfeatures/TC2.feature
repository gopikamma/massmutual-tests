Feature: Verify the values on the screen are greater than 0

Scenario: Verify all presented values on the screen is greaterthan 0
Given user is on respective page
When fetch all the values presented in screen
Then all values count should greaterthan 0 