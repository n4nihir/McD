#Author: amit
@UserLocation

 

Feature: Location 

 

Scenario: Validate the detection of location in website when opened by user
Given User has opened the website
When The user grants access to location
Then the location should be detected

 

 

 

Scenario: Validate that the detection to no location is present
Given User has opened the website
When User denies the location prompt
Then Prompt is given

 

 

 

Scenario: Validate the selection of location manually by user
Given User has logged in
When Location is detected
Then Nearest store to the location selected

 

 
Scenario: Validate the selection of location manually by user when logged in
Given User has logged in
When When User selects location on map
And clicks done button
Then Nearest store to the location selected



Scenario: Validate the selection of location manually by user when not logged in
Given User has not logged in
When User selects location on map
And clicks done button
Then Error Message is displayed "Please Login before selecting location"
 


Scenario: Validate the display of location at the top navbar
Given When When User selects location on map
And clicks done button
Then Selected location is displayed at the top Navbar of the website