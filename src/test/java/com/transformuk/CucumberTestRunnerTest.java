package com.transformuk;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/cucumber", monochrome=true)
public class CucumberTestRunnerTest {

}