Feature: Create an account of FB5
# As an user you need to open FB home page and do the validations

Scenario: validate First name field55

Given User need to be on login Facebook page
When User enters "robert@gmail.com" user email
Then User checks "robert@gmail.com" user email is present


Scenario: Validate create user multiple fields56
Given User need to be on login Facebook page
When User enters "ryan@gmail.com" user email
And User enters "12345" user password
Then User checks "ryan@gmail.com" user email is present
And User checks "12345" user password is present
