Feature: Verify Login/Sign up functionalities 


#write a scenario for creating an account on automation practice
#Given = pre-condition
#When = steps/actions to take 
#Then = expected result / what you're verifying 
#And = defined based on whatever Given, When, Then you put it after 

Background:
	Given User is already on automation practice homepage 
	When User clicks on sign in button 
	And User enters "mustakil@gmail.com" in Email Address Text Box 
	And User clicks on Create an Account button 
	Then User should be on Create an Account Page 
	
@practice_scenario_outline
Scenario Outline: Create/register four accounts successfully 
	When User enters "<email_address>"  in email Address Text Box
	And User clicks on Create an Account button 
	Then User should be on Create an Account Page 
	
Examples:	
	
	| email_address   | 
	| park@gmail.com  | 
	| sim@gmail.com   | 
	| me@gmail.com    | 
	| moose@gmail.com | 


Scenario: Create/register an account successfully (preferred way to write scenario) 
	When User enters Personal Information 
	And User enters Address Information 
	And User clicks on Register button 
	Then User should successfully be landed on My Account page 


	
@smoketests
Scenario: Create/register an account successfully (practice way to write scenario)  
	When User clicks on Mr. radio button 
	And User enters "Mustakil" in First Name Text Box 
	And User enters "Ali" in Last Name Text Box 
	And User enters "mustakil.ali@gmail.com" in Email Address Text Box in Personal Information 
	And User enters "123" in Password Text Box 
	And User selects D.O.B in dropdowns 
	And User clicks on Sign up for our newsletter! checkbox 
	And User clicks on Rrecieve special offers from our partners! checkbox 
	And User enters "Mustakil" in First Name Text Box under Address 
	And User enters "Ali" in Last Name Text Box under Address 
	And User enters "TEchCircle" in Company Text Box 
	And User enters "14631 Lee Hw" in Address line one text box 
	And User enters "#301" in Address line two text box 
	And User enters "Centreville" in City text box 
	And User selects own state 
	And User selencts own country 
	And User enters "7034555353" in Mobile Phone textbox 
	And User clicks on Register button 
	Then User should successfully be landed on My Account page 
	
