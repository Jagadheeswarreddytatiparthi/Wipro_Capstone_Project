Feature: check the functionality of Add to cart button
Scenario: Go to home page click on search box enter an item search for it and add that item into cart 
Given nopCommerce home PagE
When Click on Search Box 
And Enter an item name to Search
And Click on search buttoN
And Click on Addtocart button
Then Item is added to cart successfully.