@Login
Feature: Test the Login functionality of the Orange HRM application
Scenario: Simple - Test the positive login functionality
Given User is on the url - "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When User enters a valid username and password
And User clicks 'Login' button
Then Homepage should be displayed