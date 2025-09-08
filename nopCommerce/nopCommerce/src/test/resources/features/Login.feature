Feature: Check the Login flow 
Scenario: Go to home page click on Login 
Given nopCommerce Home page
When Click on Login
And Fill the "<email>" field
And fill the "<password>" field
And click on login button
Then login is successful.
Examples:
|   email                               |    password       |   Status    |
|tatiparthijr2001@gmail.com             |   Reddy@7125      |   Pass      |
|tatiparthijagadheeswarreddy@gmail.com  |   Jaga@8883       |   Pass      |
|abcdef@gmail.com                       |    abcd@123       |   Fail      |
|7834957@gmail.com                      |    ahkdsgfg       |   Fail      |