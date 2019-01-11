Feature: To validate the login of KatalonDemoWebsite11
As a user, you need to open the Katalon Demo login page and do the validations

Scenario: Validate the username field111
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
Then User checks "John Doe" user name is present

Scenario: Validate the username and password field112
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
And User enters "ThisIsNotAPassword" password
Then User checks "John Doe" user name is present
And User checks "ThisIsNotAPassword" password is present
#example : But User Mobile field should be blank