Feature: Test ME App

  Scenario: login to the user page
     When I go to login page
    And I enter user details
 							|username	|	password	|
						 	|john			|		john		|
 							|Lalitha	|password123|
 And Select HeadPhones and add to cart
 Then the payment page should be appeared
 
 