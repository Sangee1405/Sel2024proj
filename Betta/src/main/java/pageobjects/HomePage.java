package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public void enterProductName(String productName){

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

    }

    public void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void selectCategoryDropdownByIndex(int index){

        WebElement catElement = driver.findElement(By.id("searchDropdownBox"));
        Select f = new Select(catElement);
        f.selectByIndex(index);
    }

    public void selectCategoryDropdownByValue(String value){
        WebElement catElement = driver.findElement(By.id("searchDropdownBox"));
        Select s =new Select(catElement);
        s.selectByValue(value);
    }
}
