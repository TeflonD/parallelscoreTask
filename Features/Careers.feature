Feature: Careers

	
	
Scenario: Check that a user can select a categoty and location

	Given user launches chrome browser 
	When user navigates to the URL "https://parallelscore.com"
	And the user selects Full time from the catory drop-down field
	And the user selects Lagos from the Location drop-down field
	And the user clicks on the search button
	Then the Careers – ParallelScore page should be displayed to the user
	And the user closes the browser