package com.automation.runner;

import org.junit.runner.RunWidth;
import io.cucumber.junit.CucumberOptions;

@RunWidth(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/automation/steps")
public class TestRunner {
    
}

