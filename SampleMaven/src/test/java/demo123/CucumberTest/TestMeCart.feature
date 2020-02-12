Feature: TestME validation for the cart
@Sanity
Scenario: user cross check for adding item in the cart
Given Application launched by registarion user for cart
Then user verfying add item
@Regression
Scenario: user cross check for remove item from cart
Given Application launched by registred user for cart 
Then user veryfying remove item
@Sanity @Regression
Scenario: User cross check for max count in cart
Given Application launched by registred user for cart 
Then user veryfying max count item
