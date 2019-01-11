Feature: To validate the login of KatalonDemoWebsite9
As a user, you need to open the Katalon Demo login page and do the validations

Scenario: Validate the username field91
Given User need to be on Katalon Demo login page
When User enters the username
Then User checks user username is present
Then close brower

Scenario: Validate the username and password field92
Given User need to be on Katalon Demo login page
When User enters the username
And User enters the password
Then User checks user username is present
And User checks user password is present
Then close brower
#example : But User Mobile field should be blank