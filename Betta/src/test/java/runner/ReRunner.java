package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"@target/rerun.txt"},
            glue = {"stepdef","hookspack"},
            tags ="@amzon",
            plugin = {"pretty",
                    "html:target/test-output/report.html",
                    "json:target/test-output/report.json",
                    "junit:target/test-output/report.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/rerun.txt"}


    )
    public class ReRunner {

    }

