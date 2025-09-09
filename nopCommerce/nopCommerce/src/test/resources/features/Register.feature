Feature: Check registration flow 
Scenario: Go to home page Click on Register 
Given nopCommerce home page
When click on Register
And Select gender
And Fill firstname as "<firstname>"
And fill lastname as "<lastname>" 
And fill email as "<email>"
And fill companyName as "<companyName>"
And fill password  and confirmpassword as "<password>"
And click on register button
Then registration is successfull
Examples:
|     firstname        |     lastname        |    email                      |    companyName      |   password     |  confirm password     |
|   Jagadheeswarreddy  |     Tatiparthi      |  tatiparthijr2001@gmail.com   |    Wipro            |   Reddy@7125   |  Reddy@7125           |
 