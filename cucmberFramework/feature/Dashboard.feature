Feature: Customer
Scenario: Dashboard logo and user name
    Given User launch chrome browser
    When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email "admin@yourstore.com" and password "admin"
    And user click on log in button 
    Then user can view logo
    And User can view username as "John Smith"
    Then close browser