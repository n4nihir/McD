#Author: amit
@PlayStoreIcon

 

Feature: PlaystoreIcon

 

Scenario: Validate that the new tab opens the play store page upon clicking the play store icon
Given User has opened the website
When User clicks on the play store icon
Then New tab opens with playstore page

 

Scenario: Validate that McDonald app download link opens in the new tab upon clicking the play store icon
Given User has opened the website
When User clicks on the play store icon
Then New tab opens and play store page loads with McDelivery app download page


 

Scenario: Validate that the error message is shown when the browser blocks the pop-up upon clicking the play store icon
Given User has opened the website
And Enabled pop-up blocker
When User clicks on the play store icon
Then Displays message: "It looks like the pop-up is disabled by your browser. Please allow it to continue"

 

 
Scenario: Validate that the original tab should stay open in the same state it was
Given User has opened the website
When User clicks on the play store icon
Then Doesn't refresh or reloads the page

