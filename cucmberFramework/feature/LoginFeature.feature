
Feature: Log in user

  Scenario: Log in with valid credentials
    Given User launch chrome browser
    When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user enters email "admin@yourstore.com" and password "admin"
    And user click on log in button 
    Then user should navigate to dashboard 
    When user click on log out button
    Then page title should be "Your store. Login"
    And close browser


