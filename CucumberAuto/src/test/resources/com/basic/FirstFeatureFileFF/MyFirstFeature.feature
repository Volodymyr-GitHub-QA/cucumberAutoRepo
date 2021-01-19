Feature: Create an account of FB4
# As an user you need to open FB home page and do the validations

Scenario: validate First name field44

Given User need to be on login Facebook page
When User enters user first name
Then User checks user first name is present

# Scenario: Validate create user multiple fields
# Given User need to be on login Facebook page
# When User enters user first name
# And User enters user surname
# Then User checks user first name is present
# But User mobile field should be blank