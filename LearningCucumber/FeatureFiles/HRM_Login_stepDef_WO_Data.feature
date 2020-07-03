@DataTable
Feature: Test the Login functionality of the Orange HRM application
@Positive
Scenario: Test the positive login functionality
Given EndUser is visiting the url - "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Enduser gives a valid credientials
|Admin|admin123|
And Enduser presses 'Login' button