Feature: Create an account of FB2
# As an user you need to open FB home page and do the validations

Scenario Outline: Validate create user multiple fields22
Given User need to be on login Facebook page
When User enters "<email>" user email
And User enters "<password>" user password
Then User checks "<email>" user email is present
And User enters "<password>" user password
Then close browser
Examples:
| email 						| password |
| tom@gmail.com 		| 12345 	 |
| robert@gmail.com  | 6789 		 |