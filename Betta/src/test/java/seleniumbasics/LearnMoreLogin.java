package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMoreLogin {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        d.findElement(By.id("username")).sendKeys("sangee");
        d.findElement(By.id("password")).sendKeys("123");
        d.findElement(By.xpath("//button[@onclick='login()']")).click();
        String errorMessage= d.findElement(By.xpath("//p[@id='errorMessage']")).getText();
        System.out.println(errorMessage);

    }
}
