Feature: check the functionality of addtocart button 
Scenario: Click on search box search for an item add it to add to compare list 
Given User on nopCommerce HOME page 
When Click on search box  for searching item
And enter an item to search 
And click on addtocompare button 
Then Item is added to addtocompare successfully.
