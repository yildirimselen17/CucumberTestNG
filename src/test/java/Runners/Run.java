package Runners;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(


        features = "src/test/Resources.firstTest/FirstTest.feature" ,
        glue = {"StepDefinitons"} ,
        dryRun = false




)

public class Run extends AbstractTestNGCucumberTests {



}
