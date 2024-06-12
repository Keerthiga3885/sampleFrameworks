package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseLevel1 {

    public static WebDriver driver = null;

    public void launchE6data() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Launch e6data url
        driver.get("https://plt-beta.itachi.ai/login");

    }

    public void waitToClick(WebDriver driver, int time, WebElement element) {

        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(element));

    }

    public void closeDriver() {

        driver.quit();

    }
}



