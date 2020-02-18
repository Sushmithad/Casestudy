Feature: test me case study

Background: As user I Launch test me app
Given Guest user launching the application

Scenario: Guest user registering in test me app
Given Guest user accessing the SignUp link
Then user makes valid data as the input
When he submits registration success

Scenario: registered user verification for the login in test me app
Given Registered user clicks on SignIn Link
Then Registered user provides valid cred
And checks for the login status for success

Scenario: User searches for an item using four letters
When guest user entering some data 
Then clicks on find details for the item
Then Checks for the paynow option
And Verifies for its addition in the cart



