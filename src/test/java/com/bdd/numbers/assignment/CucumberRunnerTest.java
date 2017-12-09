package com.bdd.numbers.assignment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "json:target/cucumber.json" },
        glue = "com.bdd.numbers.steps",
        features = "src/test/resources/features"
)
public class CucumberRunnerTest {
	
}
