
Feature: Add new languages
  
  Scenario Outline: Successfully add new language
    Given User navigates to login page
    When User enters <username> and <password>
	  Given User navigates to languages page
	  And User click on add button
	  When User enter <name>
	  And User click save
	  Then User sucessfully enter new languages
	  
	 Examples: 
	 	| username | password | name |
	 	| Admin | admin123 | Japanese |
	 	
  
  Scenario Outline: Add same language
    Given User navigates to login page
    When User enters <username> and <password>
	  Given User navigates to languages page
	  And User click on add button
	  When User enter <name>
	  And User click save
	  Then Error label will appear
  
  Examples: 
	 	| username | password | name |
	 	| Admin | admin123 | Japanese |
	 	
	 	
	Scenario Outline: User enter blank name
    Given User navigates to login page
    When User enters <username> and <password>
	  Given User navigates to languages page
	  And User click on add button
	  When User enter <name>
	  And User click save
	  Then Required label will appear
  
  Examples: 
	 	| username | password | name |
	 	| Admin | admin123 | * |
  