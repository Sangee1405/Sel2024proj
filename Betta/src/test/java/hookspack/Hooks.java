package hookspack;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
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

        System.out.println("Execution ended");
    }

    @BeforeStep()

        public void beforeStep(){
        System.out.println("beforestep");
    }


    @AfterStep()
    public void afterStep(){
        System.out.println("afterstep");
    }
}
