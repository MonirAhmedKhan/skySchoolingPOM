Feature: Login Functionalities

Scenario: Login with valid Id and password
Given I am in landing page
When I click on Longin Button Menu
Then I enter user Id
And I enter Password
And Click Login Button
Then Dashboard Page will appear
