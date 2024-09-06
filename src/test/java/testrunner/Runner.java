package testrunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features= "features",
glue="stepdefinition",
plugin="com.aventstack.extentreports.cucumber.adapter.extentcucumberadapter:",
//plugin={"pretty","html:target/cucumber.html", "junit:target/junit.xml","json:target/json/reportJson.json"},
monochrome=true,
tags="@Tag1"
      )

public class Runner extends AbstractTestNGCucumberTests {
//	plugin="com.aventstack.extentreports.cucumber.adapter.extentcucumberadapter";

}
