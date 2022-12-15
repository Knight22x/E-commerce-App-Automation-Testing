package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static utility.Constants.ROOT;

@CucumberOptions(features = {ROOT},
        glue = {"stepdefinitions"})

public class TestRunner extends AbstractTestNGCucumberTests {

}