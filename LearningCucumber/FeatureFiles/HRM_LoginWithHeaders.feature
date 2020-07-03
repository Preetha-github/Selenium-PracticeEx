Feature: Test the Login functionality with data for the Orange HRM application
@Login
Scenario: With Headers - Test the login functionality
Given Testuser is on login_page - "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Testuser enters a correct credientials 
|Username | Password|
|Admin    | admin123|
And Testuser clicks 'Login' button
