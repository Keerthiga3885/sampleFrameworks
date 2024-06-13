package Utils;

import enums.Enums;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver initiatliseDriver(String browserName){

        WebDriver driver;
        switch(Enums.BROWSER_NAME.valueOf(browserName.toUpperCase())){

            case CHROME :
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                return driver;

            case FIREFOX :
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;

            case SAFARI :
                driver = new SafariDriver();
                driver.manage().window().maximize();
                return driver;

            case EDGE :
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                return driver;

            default :
                System.out.println("Browser not available");
        }

    return null;

    }

}
