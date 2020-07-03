@Hooks
Feature: Login functionality with Hooks - Orange HRM application 
Scenario: Login with Hooks
Given User on  url - "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When Enters valid username and password
And Click 'Login' button
