Feature: Test Google Search functionality
Scenario: Google search scenario
	Given the user navigates to the url - 'http://google.co.in' 
	When the user types the search term - 'selenium tutorials' 
	And the user hits - 'ENTER' Key
	Then the search results should be displayed