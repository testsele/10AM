Feature: Testing Login Functionality

Scenario: Testing Login with Valid Credentials
Given User Launch Application
When User Enter UID and PWD and CLick on Login
Then User able to Login

Scenario: Testing Login with Invalid Credentials
Given User Launch Application
When User Enter Invalid UID and PWD and click on Login
Then User unable to login
