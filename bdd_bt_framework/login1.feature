Feature: verify login credentials
Scenario: as a user should be login using valid credentials
Given open browser
And go to facebook.com
When user type valid userId in username textbox
And user type valid password in password textbox
And user click in Login button
Then user should see his profile page

Scenario Outline: as a user should not be login using invalid credentials
Given open browser
And go to facebook.com
When user type "<invalid_userId>" in username textbox
And user type "<invalid_password>" in password textbox
And user click in Login button
Then user should not see his profile page

Examples: 
|invalid_userId|invalid_password|
|user1|abcd1234|
|user2|abcd1234|
|user3|abcd1234|
