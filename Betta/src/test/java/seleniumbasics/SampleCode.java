package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver( );
        driver.get("https://login.salesforce.com/?locale=au");
        driver.findElement(By.id("username")).sendKeys("sangee");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.name("Login")).click();
        String error= driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(error);


            }
}
