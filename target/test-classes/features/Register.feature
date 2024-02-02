Feature: Register an account

#@run
@smoke
Scenario: register an account for user 1

Given user is on registration page
When user enters following details
|Anurag|Shrivastava|
|8877878878|xyz@gmail.com|
And user click on submit button
Then user should be registered successfully