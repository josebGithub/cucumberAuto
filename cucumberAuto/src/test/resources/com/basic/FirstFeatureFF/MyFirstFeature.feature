Feature: To validate the login of KatalonDemoWebsite4
As a user, you need to open the Katalon Demo login page and do the validations

Scenario: Validate the username field41
Given User need to be on Katalon Demo login page
When User enters the username
Then User checks user username is present

#Scenario: Validate the username and password field
#Given User need to be on Katalon Demo login pate
#When User enters the username
#And User enters the password
#Then User checks user username is present
#And User checks user password is present
#example : But User Mobile field should be blank