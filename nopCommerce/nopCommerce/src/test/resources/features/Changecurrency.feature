Feature: To change currency of items prices
Scenario: Change the currency of page
Given nopCommerce HOME page 
When click on currency of US Dollar 
And Select from dropdown any one 
Then Currency of prices is changed successfully.
 