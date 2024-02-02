#@run
Feature: Login with multiple elements
 
Scenario Outline: Login in to application with data
 
Given user is in the loginpage for Rediff
When user enter name as <name> and password as <password> for rediff
And clicks on ok button
Then login should be successful
Examples:
|name|password|
|Name1|password1|
|Name2|password2|
|Name3|password3|
|Name4|password4|
|Name5|password5|