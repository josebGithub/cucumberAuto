Feature: To validate the login of KatalonDemoWebsite3
As a user, you need to open the Katalon Demo login page and do the validations

Scenario: Validate create user multiple fields31
Given User need to be on Katalon Demo login page
When Enter following data
 |username | password |
 |John Doe | ThisIsNotAPassword |
 |Test  | ThisIsNotPassword |


