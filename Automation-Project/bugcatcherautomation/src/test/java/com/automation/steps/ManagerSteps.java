package com.automation.steps;

import com.automation.runner.TestRunner;

    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;

    public class ManagerSteps {


        @Given("manager is logged into manager custom homepage")
        public void the_manager_is_on_their_correct_home_page(){
            TestRunner.driver.get("file://C:/Users/James%20Zhang/OneDrive/Desktop/Revature/Automation-Project/Project/login-page.html");
        }
        @When("the manager created a defect")
        public void the_manager_creates_the_defect_in_the_text_box(){
            TestRunner.manager.enterDefect("defect5");
        }

        @When("the manager enters the tester username")
        public void the_manager_enters_the_testers_username(){
            TestRunner.manager.enterTester("employee5");

        }

        @When("the manager clicks the submit button")
        public void the_manager_clicks_the_submit_button(){
            TestRunner.manager.clickButton();

    }
        @Then("the manager recieves an alert indicating the defect has been assigned")
        public void the_manager_recieves_an_alert(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TestRunner.manager.GetAlertText();

        }
}