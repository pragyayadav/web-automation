package com.automationPractic.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/automationPractice/test/features/", glue = {
		"com.automationPractice.test.stepDefinition" }, monochrome = true, plugin = { "pretty", "html:target/UIChrome.html",
				"json:target/UIChrome.json"}, tags= {"@test" })
public class TestRunner {

}
