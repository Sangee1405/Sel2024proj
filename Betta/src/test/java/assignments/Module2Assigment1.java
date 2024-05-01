package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Module2Assigment1 {
    public static WebDriver driver;

    public static void main(String[] args) {

        //driver = new ChromeDriver();
        //driver = new EdgeDriver();
        driver = new FirefoxDriver();
       driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }


}
