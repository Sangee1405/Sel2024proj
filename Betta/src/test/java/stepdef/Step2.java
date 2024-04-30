package stepdef;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import reusable.BaseCode;

public class Step2 {

    BaseCode baseCode;
    HomePage homePage;
    SearchResultPage searchResultPage;
    WebDriver driver = BaseCode.driver;

    public Step2(){

               homePage= new HomePage(driver);
        searchResultPage=new SearchResultPage(driver);

    }


}
