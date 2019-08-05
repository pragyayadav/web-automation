package com.automationPractic.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/automationPractice/test/features/OrderProduct.feature",plugin = { "pretty", "html:target/UIChrome.html", "json:target/UIChrome.json" }, tags = {})
public class RunnerFile {

}
