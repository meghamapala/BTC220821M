Feature: End to end Senarioo
Scenario Outline: As a user will be able to buy shirt using same billing and shiping address

Given Open Browser
|chrome|
|safari|
|firefox|

And go to url
When hover over on men menu
And click on new arrival
And click on shirt option
And click on any shirt
And select "<number>" shirt product
And select size
|size|
|m|
|l|
|x|
Then user should see successful message

Examples:
|number|
|1|
|5|
|3|
