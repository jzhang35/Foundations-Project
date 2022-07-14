Feature: Tester should be able to choose what to with with a defect, whether to accept, decline, reject, fix, or shelve it

Scenario: As a tester, I want to choose what to do with a defect, whether to accept, decline, reject, fix, or shelve it

Given the tester is on the tester page
When the tester clicks drop down menu
When the tester clicks on an option in the menu, whether to accept, decline reject, fix, or shelve
When the tester clicks the update button
Then tester receives a message saying the update was a success