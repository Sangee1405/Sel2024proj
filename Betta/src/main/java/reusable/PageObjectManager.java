package reusable;

import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import pageobjects.SignInPage;

public class PageObjectManager {

    public HomePage homePage;
    public SearchResultPage searchResultPage;
    public SignInPage signInPage;

    public WebDriver driver = BaseCode.driver;
    public PageObjectManager getHomePage(){

        homePage = new HomePage(driver);
        return this;

    }

    public void  getSearchResutPage(){

        searchResultPage = new SearchResultPage(driver);

    }

    public PageObjectManager getSignInPage(){

        signInPage = new SignInPage(driver);
        return this;
    }

}
