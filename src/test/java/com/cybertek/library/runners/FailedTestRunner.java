package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@Reports/return.txt",
        glue = "com/cybertek/library/step_definitions"
)

public class FailedTestRunner {
}
