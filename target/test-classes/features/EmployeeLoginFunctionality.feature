Feature: Employee login 

Scenario: Login as an Employee
Given I am in landing page
When I click on Longin Button Menu
And I Will see Employee Login Page
Then I Enter user id "testpilot@gmail.com"
And I Enter password "1234"
When I click login button
Then I Will see "Employee Home Page"