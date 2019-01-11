Feature: To validate the login of KatalonDemoWebsite2
As a user, you need to open the Katalon Demo login page and do the validations

Scenario Outline: Validate create user multiple fields21
Given User need to be on Katalon Demo login page
When User enters "<user>" user name
And User enters "<password>" password
Then User checks "<user>" user name is present
And User checks "<password>" password is present
Then close brower

Examples:
 |user | password |
 |John Doe | ThisIsNotAPassword |
 |Test  | ThisIsNotPassword |
