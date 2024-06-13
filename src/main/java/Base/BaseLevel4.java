package Base;

import Core.Wrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseLevel4 {

    public static WebDriver driver = null;
    public static Wrapper wrapper = null;

    // Launch the browser and e6data url
    public void launchE6data() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wrapper = new Wrapper(driver);
        driver.get("https://plt-beta.itachi.ai/login");

    }

    // Close the browser
    public void closeDriver() {

        driver.quit();

    }

    //Wait until the web element to be clickable
    public void waitToClick(WebDriver driver, int time, WebElement element) {

        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(element));

    }


}
