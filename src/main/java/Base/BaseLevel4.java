package Base;

import Core.Wrapper;
import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseLevel4  {

    public static Wrapper wrapper = null;

    // Launch the browser and e6data url
    public void launchE6data() {

        Driver.getDriver().manage().window().maximize();
        wrapper = new Wrapper(Driver.getDriver());
        wrapper.launchUrl("https://plt-beta.itachi.ai/login");

    }

    // Close the browser
    public void closeDriver() {

        Driver.closeDriver();

    }

    //Wait until the web element to be clickable
    public void waitToClick(WebDriver driver, int time, WebElement element) {

        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(element));

    }


}
