Feature: Login into gmail
 
@smoke 
Scenario: Login into gmail with valid credentials
 
Given user is in the login page
When user enter valid name and password
And clicks on sigin
Then login should be successful

Scenario: Login into gmail with Invalid credentials
 
Given user is in the login page
When user enter Invalid name and password
And clicks on sigin
Then login should not happen

@reg @smoke
Scenario: Login into gmail with valid credentials
 
Given user is in the login page
When user enter valid name as "Name1" and password as "Password1"
And clicks on sigin
Then login should be successful
 
Scenario: Login into gmail with valid credentials
 
Given user is in the login page
When user enter valid name as "Name2" and password as "Password2"
And clicks on sigin
Then login should be successful
 
@reg 
Scenario: Login into gmail with valid credentials
 
Given user is in the login page
When user enter valid name as "Name3" and password as "Password3"
And clicks on sigin
Then login should be successful
