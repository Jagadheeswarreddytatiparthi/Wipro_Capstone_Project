Feature: Check the Login flow 
Scenario: Go to home page click on Login 
Given nopCommerce Home page
When Click on Login
And Fill the email field
And fill the password field
And click on login button
Then login is successful.