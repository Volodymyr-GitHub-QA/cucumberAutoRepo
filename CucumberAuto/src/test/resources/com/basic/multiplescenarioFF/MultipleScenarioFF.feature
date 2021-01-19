Feature: Create an account of FB7
# As an user you need to open FB home page and do the validations

Scenario: validate First name field71

Given User need to be on login Facebook page
When User enters user email
Then User checks user email is present
Then close browser


Scenario: Validate create user multiple fields72
Given User need to be on login Facebook page
When User enters user email
And User enters user password
Then User checks user email is present
And User checks user password is present
Then close browser