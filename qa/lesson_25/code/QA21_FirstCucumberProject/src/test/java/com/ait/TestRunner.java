package com.ait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com/ait/stepDefinitions",
        tags = "@wrongPassword",
        plugin = {"pretty", "json:build/cucumber-report/cucumber.java"})
public class TestRunner {
}
