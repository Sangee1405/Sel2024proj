package stepdef;

import reusable.PageObjectManager;


public class ManagerSteps {

    PageObjectManager pageObjectManager;
    public ManagerSteps(){

        pageObjectManager = new PageObjectManager();
    }
    public void m1(){

        pageObjectManager.homePage.clickSignIn();
        pageObjectManager.signInPage.enterMail().clickContinue();
    }
}
