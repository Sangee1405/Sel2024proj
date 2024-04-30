package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    WebDriver driver;
    public SearchResultPage(WebDriver driver){
        this.driver=driver;
    }


    public String getTiltleofSearchPage(){

       return driver.getTitle();

    }
    public void selectProductFromSearchResultPage(int searchIndex){

        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+searchIndex+" ' ]")).click();


    }
}
