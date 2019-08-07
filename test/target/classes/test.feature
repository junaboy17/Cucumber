Feature: Login Feature
  
  As a user of abc.com I can log in 
  So I can use the benefit of the site

	Background: Open browser and go to application
		Given I open broweser chrome
    And I browse to www.multicart.com

  Scenario: Successfull Login
    
    And I enter my ID
    And I enter my Password
      | ID   | Password |
      | user | Pass     |
    When I click the login button
    Then I see my profile as "James William"
    
   Scenario: Successful LogOut
		Given I open browser chrome
		And I browse to www.multicart.com
		And I successfully log in 
		And I log out
		Then I should not see James Williams  

    Scenario Outline: 
    
    Examples:
    |Browsers|
    |Chrome|
    |FX|
    |IE|