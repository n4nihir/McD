#Author: amit
@Search

 

Feature: Search 

 

Scenario: Validate that the user is able to type in the search box
Given User has opened the website
When User clicks on the search box
Then Search box gets focus

 

 

 

Scenario: Validate that the list of relevant items appear
Given User has opened the website
When User clicks on the search box
And Enters the name of the item
Then Drop down list appears with list of the relevant items

 

 

 

Scenario: Validate that the message is displayed if the name doesn't match any item
Given User has opened the website
When User clicks on the search box
And Enters the name of the item
Then Displays message: "No results found. Check your spelling or try something different."