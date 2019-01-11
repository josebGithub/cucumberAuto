Feature: To validate the login of KatalonDemoWebsite1
As a user, you need to open the Katalon Demo login page and do the validations

Background:common login steps
Given User need to be on Katalon Demo login page

Scenario: Validate the username field11
When User enters "John Doe" user name
Then User checks "John Doe" user name is present
Then close brower

Scenario: Validate the username and password field12
When User enters "John Doe" user name
And User enters "ThisIsNotAPassword" password
Then User checks "John Doe" user name is present
And User checks "ThisIsNotAPassword" password is present
Then close brower
#example : But User Mobile field should be blank