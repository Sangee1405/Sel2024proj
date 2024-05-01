package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Module2Assignment3 {

    public static WebDriver driver;

    public static void main(String[] args) {

        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.getTitle());
        driver.close();
    }

}

