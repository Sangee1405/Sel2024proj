package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Module3Assignment1And2 {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        System.out.println(driver.getTitle());
        driver.switchTo().frame("login_page");
    driver.findElement(By.partialLinkText("Know ")).click();
    Thread.sleep(2000);
        ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(list);
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getTitle());
        driver.quit();
        //driver.close();
            }
}
