@tag

Feature: Customer

Background: Steps common for all scenarios
 Given User launch chrome browser
    When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email "admin@yourstore.com" and password "admin"
    And user click on log in button 
    Then user can view dashboard 

@regression
Scenario: Add new customer

   
    When user click on customer menu
    And click on customer menu item
    And click on add new button
    Then user can view add new customer page
    When user enters customer info 
    And click on save button
    Then user can see confirmation message "The new costomer has been added successfully"
    And close browser


@regression1
 Scenario: Search customer by email
		  
		When uesr clicks on customer menu
		And user click on customers menu item
		When user enters Email "james_pan@nopCommerce.com"
		And click on search button
		Then user should found email in search table
		And close browser



   
