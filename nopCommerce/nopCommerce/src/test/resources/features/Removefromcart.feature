Feature: Check the functionality of remove from cart 
Scenario: Go to shopping cart if no item is there Search and add that item
Given nopCommerce HOme page 
When Click on search box 
And Enter a search item 
And click on search button 
And Click on addtocart button 
And Click on Shopping cart 
And click on remove from cart 
Then item is removed from cart   
