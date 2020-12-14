#Author: nihirk
@Cart

Feature: Cart



Scenario: Validate the increase in quantity of item
Given User has added items to the cart and is on cart page
When user clicks on (+) button
Then the quantity of the particular item in the cart increases



Scenario: Validate the decrease in quantity of item
Given User has added items to the cart and is on cart page and has increased the quantity of the particular item
When user clicks on (-) button
Then the quantity of the particular item in the cart decreases



Scenario: Validate the display of added item with correct customizations
Given User has added items with customizations to the cart
When user navigates to cart page
Then the cart displays the correct customizations along with the item



Scenario: Validate a confirmation box before completely removing an item from the cart
Given User has added item to the cart and increased the quantities and is on cart page
When user clicks on (-) button multiple times until there's one quantity left
And user again clicks on (-) button
Then a confirmation box is displayed asking "Are you sure that you want to remove the item?"



Scenario: Validate the successful removal of an item from the cart after confirmation
Given User has added item to the cart and increased the quantities and is on cart page
When user clicks on (-) button multiple times to remove the item completely
And clicks on OK button in the confirmation box
Then navigate to cart page with the removed item completely removed from the cart



Scenario: Validate the failure in removal of an item from the cart after negative confirmation
Given User has added item to the cart and increased the quantities and is on cart page
When user clicks on (-) button multiple times to remove the item completely
But clicks anywhere except the OK button in the confirmation box
Then navigate to cart page with the particular item having single quantity



Scenario: Validate the successful removal of all items from the cart after confirmation
Given User has added multiple items to the cart and is on cart page
When user clicks on Clear All button
And clicks OK button in the confirmation box
Then navigate to cart page with empty cart



Scenario: Validate the failure in removal of all items from the cart after negative confirmation
Given User has added multiple items to the cart and is on cart page
When user clicks on Clear All button
But clicks anywhere except the OK button in the confirmation box
Then navigate to cart page with all the items previously added as it is


