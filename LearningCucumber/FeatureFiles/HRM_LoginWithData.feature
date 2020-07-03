@DataTable
Feature: With Data - Test the Login functionality with data for the Orange HRM application
Scenario: With Data - Test the login functionality
Given User is on login page - "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When User enters a valid credientials - "Admin" and "admin123"
And User clicks on 'Login' button
Then Navigates to Homepage 