package hookspack;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks {

    @Before()
    public void preCondition() throws IOException {
        System.out.println("Execution starts");
        BaseCode.launchBroswer();
    }

    @After()
    public void postCondition(){
        //BaseCode.driver.close();
        BaseCode.driver.quit();
        System.out.println("Execution ended");

    }

    @BeforeStep()

        public void beforeStep(){

        System.out.println("beforestep");
    }


    @AfterStep()
    public void afterStep(Scenario sc){

        byte[] bytedata= ((TakesScreenshot)BaseCode.driver).getScreenshotAs(OutputType.BYTES);

        System.out.println("afterstep");
        sc.attach(bytedata,"image/png",sc.getName());
    }
}
