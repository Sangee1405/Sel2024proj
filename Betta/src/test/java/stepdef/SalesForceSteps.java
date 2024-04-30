package stepdef;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusable.ReadExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.*;


public class SalesForceSteps extends BaseCode {

    WebElement categoryElement;

    String amazonProdName;
    WebElement categoryCurrency;

//    @Given("user navigates to salesforce login page")
//    public void loginPage() {
//        driver = new ChromeDriver();
//        driver.get("https://login.salesforce.com/");
//
// }


    @When("user enter the username {string} and password {string}")
    public void enterCredi(String username, String password) {
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(BaseCode.pro.getProperty("username"));
        //driver.findElement(By.id("username")).sendKeys(BaseCode.pro.getProperty("username"));
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @And("user clicks on login button")
    public void ClicksLoginButton() {
        driver.findElement(By.id("Login")).click();

    }

    @Then("verify whether the user navigates to home page")
    public void verifyHomePage() {

    }

    @And("verify the title")
    public void verifyTheTitle() {

    }

    @Then("verify the error message")
    public void verifyTheErrorMessage() {
        String actualResult = driver.findElement(By.id("error")).getText();
        String expectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator";

       // Assert.assertEquals(expectedResult,actualResult);

        if (actualResult.equals(expectedResult)) {

            Assert.assertTrue(true);
                       // System.out.println("pass");
        } else {

            Assert.assertTrue(false);
            //System.out.println("fail");
        }
    }

//    @Given("user navigates to Amazon Homepage")
//    public void gotoAmazonHomepage() {
//
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//
//
//    }

    @When("user enters the product name {string} in searchbox")
    public void enterProductName(String search) {
         amazonProdName= search;
        driver.findElement(By.xpath("//label[@for='twotabsearchtextbox']/following-sibling::input")).sendKeys(search);
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    @Then("verify the search result")
    public void verifySearchResult() {

       String actualTitle= driver.getTitle();
       //String expectedTitle="Amazon.in : ïPhone";
        String expectedTitle="Amazon.in : " +amazonProdName;

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("user selects the required value from the category dropdown")
    public void selectCategory() {
        categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select selectCat = new Select(categoryElement);
        //selectCat.selectByIndex(2);
        //selectCat.selectByVisibleText("Books");
        selectCat.selectByValue("search-alias=industrial");

    }

    @And("the user extract the dropdown values")
    public void theUserExtractTheDropdownValues() {
        int catSize = categoryElement.findElements(By.tagName("option")).size();
        for (int i = 0; i < catSize; i++) {

            String value = categoryElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);

        }
    }

//    @Given("user navigates to Wiki page")
//    public void userNavigatesToWikiPage() {
//
//        driver = new ChromeDriver();
//        driver.get("https://en.wikipedia.org/wiki/Tata_Consultancy_Services");
//
//    }


    @When("user extracts the column one value")
    public void userExtractsTheColumnOneValue() {

//        int colOneCount= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th")).size();
//        for (int j=0; j < colOneCount;j++){
//
//            String colOneValue= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th")).get(j).getText();
//            System.out.println(colOneValue);
        //   }

//        List<String>val=new ArrayList<String>();
//        List<WebElement>colOneElement=driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th"));
//
//        for(WebElement e:colOneElement)
//        {
//            val.add(e.getText());
//        }
//        System.out.println(val);
//        for(String v:val){
//            if(v.equals("Founder")){
//                //System.out.println("Founder is present");
//                Assert.assertTrue(true);
//                break;
//            }
//        }
//    }



        WebElement tab = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

        int sizz = tab.findElements(By.tagName("th")).size();

        List<String > colOneValue = new ArrayList<String>();

        for (int k = 0; k < sizz; k++) {

            colOneValue.add(tab.findElements(By.tagName("th")).get(k).getText());

           // System.out.println(tab.findElements(By.tagName("th")).get(k).getText());
        }

        System.out.println(colOneValue);



        List<WebElement> ta =tab.findElements(By.tagName("th"));
        List<String> se = new ArrayList<String>();

        for(WebElement t:ta){

            se.add(t.getText());
        }

        int siz = tab.findElements(By.tagName("td")).size();

        List<String> colTwoVal= new ArrayList<String>();

        for (int k = 2; k < siz; k++) {

            colTwoVal.add(tab.findElements(By.tagName("td")).get(k).getText());

           // System.out.println(tab.findElements(By.tagName("td")).get(k).getText());
        }

        System.out.println(colTwoVal);

        Map<List,List> m = new HashMap<List,List>();
        m.put(colOneValue,colTwoVal);

        for(Map.Entry h:m.entrySet()){

            switch (h.getKey().toString()) {
                case "ISIN" -> Assert.assertEquals("INE467B01029", h.getValue());
                case "Founder" -> Assert.assertEquals("J. R. D. Tata", h.getValue());
            }
        }

    }
 
    @Given("user navigates to Spicejet Book Homepage")
    public void userNavigatesToSpicejetHomepage() {
        driver = new ChromeDriver();
        driver.get("https://book.spicejet.com/");

    }

    @When("user selects the required value from the Currency dropdown")
    public void userSelectsCurrencyDropdown() {
        categoryCurrency = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select selectCat1 = new Select(categoryCurrency);
        selectCat1.selectByIndex(4);


    }

    @And("user extract the dropdown currency")
    public void userExtractTheDropdownCurrency() {

        int catSize1 = categoryCurrency.findElements(By.tagName("option")).size();
        for (int l = 0; l < catSize1; l++) {

            String val = categoryCurrency.findElements(By.tagName("option")).get(l).getText();
            System.out.println(val);
        }
    }

    @Given("user selects the baby wishlist")
    public void userSelectsTheBabyWishlist() {

        WebElement e = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(e).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        //driver.findElement(By.partialLinkText("Wish from An")).click();

    }

    @When("user navigates to child window")
    public void userNavigatesToChildWindow() {
        String parentProperty = driver.getWindowHandle();

        Set<String> handleValues = driver.getWindowHandles();
        for (String winPop : handleValues) {
            if (!winPop.equals(parentProperty)) {
                driver.switchTo().window(winPop);
                break;
            }
        }
        driver.findElement(By.linkText("Create your wishlist")).click();
        System.out.println(driver.getTitle());
        // driver.switchTo().window(parentProperty);
    }
    @Given("user drag and drops")
    public void userDragAndDrops() {

        WebElement frameElement= driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        WebElement dragElement= driver.findElement(By.id("draggable"));
        WebElement dropElement= driver.findElement(By.id("droppable"));
        Actions drag = new Actions(driver);
        drag.dragAndDrop(dragElement,dropElement).build().perform();
        driver.switchTo().defaultContent();


    }

    @Given("user enter the credentials")
    public void userEnterTheCredentials() throws IOException {
        driver.findElement(By.id("username")).sendKeys(ReadExcel.getExcelData("login",0,0));
        driver.findElement(By.id("password")).sendKeys(ReadExcel.getExcelData("login",1,0 ));
    }

    @When("user enters the product name {string} in shop by category")
    public void userEntersTheProductName(String search1) {

        driver.findElement(By.xpath("//label[@for='gh-ac']/following-sibling::input")).sendKeys(search1);
    }

    @Then("verify the search")
    public void verifyTheSearch() {
    }

    @Given("Enable disable")
    public void enableDisable() {

        boolean radio = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isSelected();
        Assert.assertTrue(radio);

        boolean field= driver.findElement(By.id("custom_date_picker_id_2")).isEnabled();
        Assert.assertFalse(field);

        driver.findElement(By.xpath("//*[text()='FROM']")).isDisplayed();

        String s = driver.findElement(By.id("marketDate_2")).getAttribute("style");

        if(s.contains("0.5")){
            Assert.assertTrue(true);
                    }

        driver.findElement(By.id("quote")).click();
        //10 seconds
        try {
            driver.findElement(By.id("change_text")).getText();
        }
        catch(ElementClickInterceptedException e){
            WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.pollingEvery(Duration.ofSeconds(10));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("change_text")));
            driver.findElement(By.id("change_text")).getText();

        }
    }

    @When("user extracts the list")
    public void userExtractsTheList() {

        List<String> val = new ArrayList<String>();
        List<WebElement> colOne = driver.findElements(By.xpath("//div[@id='content']/descendant::li/child::a"));

        driver.findElement(By.partialLinkText("Basic A")).click();
    }

    @Given("user upload the profile photo")
    public void userUploadTheProfilePhoto() throws InterruptedException {

        Thread.sleep(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//div[@class='position-absolute color-bg-default rounded-2 color-fg-default px-2 py-1 left-0 bottom-0 ml-2 mb-2 border']")).click();
        WebElement addFile = driver.findElement(By.xpath("//label[@class='dropdown-item text-normal']"));
        addFile.click();
        addFile.sendKeys("C:\\Users\\ravch\\Screenshot_20221129_072331.png");
        driver.findElement(By.xpath("//span[text()='Set new profile picture']")).click();
    }

    @Then("verify the login status")
    public void verifyTheLoginStatus() {

    }


//
//    @Given("user handles the alert")
//    public void userHandlesTheAlert() {
//
//        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//        String alertMessage = driver.switchTo().alert().getText();
//        Assert.assertEquals("I am an alert box",alertMessage);
//
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
//
//
//
//    }
//
//    @Given("user handles the confirmation")
//    public void userHandlesTheConfirmation() {
//
//        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        driver.switchTo().alert().accept();
//
//            }

//    @Given("user goes to ebay site")
//    public void userGoesToEbaySite() {
//
//    }
}
