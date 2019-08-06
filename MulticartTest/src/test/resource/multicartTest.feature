Feature: Home Page Test

As a Multicart user I should able to 
launch Multicart Web Page, see Home Page 
Features and Sign Up

#Scenario: Open browser and go to application
		
Background: 
	Given I open "chrome"
    And I browse to "https://www.demo.iscripts.com/multicart/demo/index.php"

Scenario: Verify Search
		
		Then I should see "SEARCH" 
		
Scenario:   Successful Sign Up

		When I click logIn and signUp	
		And I enter all userInformation and click createAccount
		Then I should see "Mr. AKM"
		
		