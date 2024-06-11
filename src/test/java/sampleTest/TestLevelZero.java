package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLevelZero {

    @Test(priority = 1)
    public void workspaceTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login to e6data
        driver.get("https://plt-beta.itachi.ai/login");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Email']"))).sendKeys("keerthiga.murugan@e6x.io");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Password']"))).sendKeys("Tinku123*");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign in']"))).click();

        // Verify workspace settings
        wait.until(ExpectedConditions.elementToBeClickable(By.id("settings"))).click();
        if (driver.findElement(By.id("workspace_name")).isEnabled()) {

            throw new RuntimeException("User is allowed to hide workspace name in workspace table");

        } else {

            System.out.println("Workspace name is disabled in settings");

        }

        driver.close();

    }

    @Test(priority = 2)
    public void catalogTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login to e6data
        driver.get("https://plt-beta.itachi.ai/login");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Email']"))).sendKeys("keerthiga.murugan@e6x.io");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Password']"))).sendKeys("Tinku123*");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign in']"))).click();

        // Navigate to catalog listing screen
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='plt-beta']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Connectivity"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("OpenBook"))).click();

        // Verify catalog settings
        wait.until(ExpectedConditions.elementToBeClickable(By.id("settings"))).click();

        if (driver.findElement(By.id("name")).isEnabled()) {

            throw new RuntimeException("User is allowed to hide catalog name in catalog table");

        } else {

            System.out.println("catalog name is disabled in settings");

        }

        driver.close();

    }

    @Test(priority = 3)
    public void clusterTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Login to e6data
        driver.get("https://plt-beta.itachi.ai/login");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Email']"))).sendKeys("keerthiga.murugan@e6x.io");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Password']"))).sendKeys("Tinku123*");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign in']"))).click();

        // Navigate to cluster listing screen
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='plt-beta']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Connectivity"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='name-label ' and text()='Clusters']"))).click();

        // Verify cluster settings
        wait.until(ExpectedConditions.elementToBeClickable(By.id("settings"))).click();
        if (driver.findElement(By.id("cluster_name")).isEnabled()) {

            throw new RuntimeException("User is allowed to hide cluster name in cluster table");

        } else {

            System.out.println("Cluster name is disabled in settings");

        }

        driver.close();

    }

}
