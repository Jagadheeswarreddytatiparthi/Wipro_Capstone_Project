Feature: check the functionality of search box
Scenario: Go to home page click on search box enter an item search for it 
Given nopCommerce home Page
When Click on Search box 
And Enter an item name to search
And Click on search button 
Then searched items showed successfully.