package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/testdesign"},
        glue = {"stepdef","hookspack"},tags ="@multiple",plugin = {"pretty"}


)
public class RegressionRunner {

}
