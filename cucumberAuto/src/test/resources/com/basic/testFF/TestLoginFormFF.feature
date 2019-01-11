Feature: To validate the login of KatalonDemoWebsite
As a user, you need to open the Katalon Demo login page and do the validations

Scenario: Validate the login form
Given User need to be on Katalon  login page
When User enters "John Doe" user name
And User enters "ThisIsNotAPassword" password
Then User checks "John Doe" user name is present
And User checks "ThisIsNotAPassword" password is present
Then close brower


Scenario: Validate the submitting form 
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
And User enters "ThisIsNotAPassword" password
Then User checks "John Doe" user name is present
And User checks "ThisIsNotAPassword" password is present
Then press the submit button
And verify the form is submitted
Then close brower