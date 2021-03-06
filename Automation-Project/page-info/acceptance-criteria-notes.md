# What is Acceptance Criteria
Acceptance Criteria is simply step by step instructions for how to achieve a user story. You can write these steps in a markdown file, excell sheet, really anywhere that makes sense yo you. When creating your AC you want to follow a specific syntax: the Gherkin syntax

### What is Gherkin?
Gherkin is what we call the syntax used to create acceptance criteria. There are some key works used to describe the process of copmleting a user story, and there is a standard phrasing to use as well.

### Gherkin Keywords
**Feature**
-a feature in Gherkin is some sort of functionality tha thsold be achieveable in your application. This can
be eitehr a high level user story or a low level user stoyr, or a general piece of functionality that shold be broken down into smaller user stories
-high level user story example: As a user I want to login to access my profile page
-low level user story example: as a customer I want to login to access my profile page
-general feature example: users should be able to login and logout of the application
- **Scenario**
-a scenario is a user story, this is typically the seciton where you will actually list what user story you are working on
- **Given**
-this keyword is used to describe the starting conditionss yo your user story
- **When**
-this keyword is used to describe the steps necessary to copmletel the user story
- **Then**
-this keyword is used to describe the end results of copmleting the user story


### A few extra notes
- try to be as specific as you can with your given, when and then steps
- make sure your then statements are "Modal verbs"
- bad then statement: THEN then user is sent to the new page
- good then statement: THEN the user SHOULD be sent to the new page
- Scenarios should only cover one user story
- bad user story: as a user I want to sign in and sign out of the application so I can start and stop using it
- better user stories:
    - as a user I want to sign in so I can use the application
    - as a user I want to sign out so I cann limit access to my profile
