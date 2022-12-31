package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static utility.Constants.ROOT;

@CucumberOptions(plugin = {"pretty"}, features = {ROOT},
        glue = {"stepdefinitions"},tags = "@smoke")

public class TestRunner extends AbstractTestNGCucumberTests {

}