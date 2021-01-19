@Important
Feature: Create an account of FB101
# As an user you need to open FB home page and do the validations

@Smoke
Scenario: validate First name field102
Given User need to be on login Facebook page
When User enters "robert1@gmail.com" user email
Then User checks "robert1@gmail.com" user email is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields103
Given User need to be on login Facebook page
When User enters "ryan2@gmail.com" user email
And User enters "12345" user password
Then User checks "ryan2@gmail.com" user email is present
And User checks "12345" user password is present
Then close browser

Scenario: Validate create user multiple fields104
Given User need to be on login Facebook page
When User enters "robert3@gmail.com" user email
Then User checks "robert3@gmail.com" user email is present
Then close browser

@Regression
Scenario: Validate create user multiple fields105
Given User need to be on login Facebook page
When User enters "ryan4@gmail.com" user email
And User enters "12345" user password
Then User checks "ryan4@gmail.com" user email is present
And User checks "12345" user password is present
Then close browser

@Smoke
Scenario: Validate create user multiple fields106
Given User need to be on login Facebook page
When User enters "robert5@gmail.com" user email
Then User checks "robert5@gmail.com" user email is present
Then close browser