Feature: Manager should be able to specify or create the particular defect name and the tester

Scenario: As a manager I want to specify or create the particular defect and the tester

Given   manager is logged into manager custom homepage
When   the manager created a defect
When   the manager enters the tester username
When   the manager clicks the submit button
Then   the manager recieves an alert indicating the defect has been assigned