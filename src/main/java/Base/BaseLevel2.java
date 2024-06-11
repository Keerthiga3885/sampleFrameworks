package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseLevel2 {

    public static WebDriver driver = null;


    public void loginE6data() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login to e6data
        driver.get("https://plt-beta.itachi.ai/login");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Email']"))).sendKeys("keerthiga.murugan@e6x.io");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Password']"))).sendKeys("Tinku123*");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign in']"))).click();

    }

    public void waitToClick(WebDriver driver, int time, WebElement element) {

        new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(element));

    }

    public void closeDriver() {

        driver.quit();

    }
}



