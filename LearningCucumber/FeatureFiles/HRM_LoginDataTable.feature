@DataTable @Login
Feature: DataTable - Test the Login functionality with data for the Orange HRM application
Scenario Outline: Data Table - Test login functionality
Given Go to login_page - "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Enter correct credientials - "<Username>" and "<Password>"
And Clicks 'Login' button

Examples:
|Username|Password|
|Admin|admin1234|
|Admin|admin123|

