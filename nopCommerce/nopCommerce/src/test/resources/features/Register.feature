Feature: Check registration flow 
Scenario: Go to home page Click on Register 
Given nopCommerce home page
When click on Register
And Select gender
And Fill firstname
And fill last name 
And fill email
And fill companyname
And fill password and confirm password
And click on register button
Then registration is successfull
 