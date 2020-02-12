Feature: My validations on new Testme app

Scenario: User verification for the registration in TestMe
Given TestMe app is launched 
And User accessing registration link in TestMe app
When User providing valid data for all the required field
Then User varifying registration status

Scenario: User verification for login process
Given TestMe is launched and is accessible 
Then User clicks on the login link available in HomePage
And Provides the valid credentials
Then User creates the login status

 