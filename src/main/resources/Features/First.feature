Feature: This is my first feature file 

 @RunOnlyThis 
Scenario: This scenario add two numbers and display result
	Given I have first number 5 
	And I have second number 7 
	Then Add two numbers
	And Display Result
	
Scenario: This is second scenario 
	Given I have first number 75 
	And I have second number 17 
	Then Add two numbers
	And Display Result
	
Scenario: Add multiple numbers:
    Given I have following numbers
        |5|
        |6|
        |7|
        |8|
    Then I will add all of those numbers
    And Display Result