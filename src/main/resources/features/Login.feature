Feature: Test a basic web application

  Background:
    Given open the browser
    And enter the url as "https://www.browserstack.com/users/sign_in"
    And enter the username as "deepeshnagpal2232@gmail.com"
    And enter the password as "Redclif@1980"
    And click on the Login button

  Scenario: Validate the login and verify the page title
    Then verify the title of the homePage
