package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber1.html",
                "json:target/cucumber-reports/cucumber1.json"
        },
        features = {"src/test/resources/features1"},
        glue = {"com.example.StepDefinitions"}
        //tags = "@regression"
)

public class TestRunner1 extends AbstractTestNGCucumberTests {


}