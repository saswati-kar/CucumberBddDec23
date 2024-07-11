Feature: Codefios page login functionality validation


Scenario Outline: User should be able to login with valid credentials
Given User is on codefios login page
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks on sign in button
Then User should be landing on dashboard page
When  User clicks on List Accounts tab
When  User clicks on Add Account tab
When  User enters Account Name as "<accountName>" 
And 	User enters Initial Balance as "<initialBalance>"
And 	User enters Account Number as "<accountNumber>"
And   User clicks the Save button
Then  New account is saved successfully

 Examples:
 |username         |password|accountName|initialBalance|accountNumber|
 |demo@codefios.com|abc123  |sk         |101           |101          |
 