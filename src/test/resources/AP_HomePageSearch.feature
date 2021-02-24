Feature: Verify HomePage Search Functionalities


Background:
	Given User is already on automation practice homepage
	
@smoke @regression
Scenario: Verify search term on home page
	When  User enters a search term
	And 	  User clicks on search button 
	Then  Search box should contain the search term 
	And safheihgrs 
	
	
@smoke
Scenario: Search dresses and verify Blouse is an option
	When  User enters "dresses" in search engine
	And   User clicks on search button 
	Then  User should be on Search - My Store page 
	And   Blouse option should be displayed
	
