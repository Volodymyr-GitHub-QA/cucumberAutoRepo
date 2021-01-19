Feature: Create an account of FB3
# As an user you need to open FB home page and do the validations

Scenario: Validate create user multiple fields3
Given User need to be on login Facebook page
When Enter following data
|email |password |
|tom@gmail.com |12345 |
|robin@gmail.com |67891|
Then close browser