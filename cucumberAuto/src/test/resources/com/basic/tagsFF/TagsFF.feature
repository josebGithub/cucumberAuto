@Important
Feature: To validate the login of KatalonDemoWebsite12
As a user, you need to open the Katalon Demo login page and do the validations

@Smoke
Scenario: Validate the username field1121
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
Then User checks "John Doe" user name is present
Then close brower

@Smoke @Regression
Scenario: Validate the username and password field2122
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
And User enters "ThisIsNotAPassword" password
Then User checks "John Doe" user name is present
And User checks "ThisIsNotAPassword" password is present
Then close brower
#example : But User Mobile field should be blank


Scenario: Validate the username field3123
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
Then User checks "John Doe" user name is present
Then close brower

@Regression
Scenario: Validate the username field4124
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
Then User checks "John Doe" user name is present
Then close brower

@Smoke
Scenario: Validate the username field5125
Given User need to be on Katalon Demo login page
When User enters "John Doe" user name
Then User checks "John Doe" user name is present
Then close brower

