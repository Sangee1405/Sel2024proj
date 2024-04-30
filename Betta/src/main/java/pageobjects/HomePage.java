package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;

    }


    public HomePage enterProductName(String productName){

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    return this;

    }

    public HomePage clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
        return this;
    }

    public HomePage selectCategoryDropdownByIndex(int index){

        WebElement catElement = driver.findElement(By.id("searchDropdownBox"));
        Select f = new Select(catElement);
        f.selectByIndex(index);
        return this;
    }

    public HomePage selectCategoryDropdownByValue(String value){
        WebElement catElement = driver.findElement(By.id("searchDropdownBox"));
        Select s =new Select(catElement);
        s.selectByValue(value);
        return this;
    }

    public HomePage clickSignIn(){

        Actions a = new Actions(driver);
        a.clickAndHold(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
        return this;
    }
}
