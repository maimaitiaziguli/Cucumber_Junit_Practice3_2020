package com.cybertek.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target.myCucumber_Report3.html",
        features = "src/test/resources/features",
        glue = "com/cybertek/Step_Definititions"
)

public class CukesRunner {
}
