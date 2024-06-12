package Pages.Core;

import Base.BaseLevel3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium extends BaseLevel3 implements ITool{

    WebDriver driver;

    public Selenium(WebDriver driver){

        this.driver = driver;

    }


    @Override
    public void loginToE6data(WebElement txtuserName, WebElement txtPassword, WebElement btnSignIn,String username, String password) {

        waitToClick(driver, 10, txtuserName);
        txtuserName.sendKeys(username);

        waitToClick(driver, 10, txtPassword);
        txtPassword.sendKeys(password);

        waitToClick(driver, 10, btnSignIn);
        btnSignIn.click();

    }

    @Override
    public void selectWorkspace(String workspace) {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + workspace + "']"))).click();

    }


    public void clickWorkspaceSettings(WebElement btnSettings) {

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

    }

    @Override
    public void verifyWorkspaceNameDisableInSettings(WebElement chkWorkspaceName) {

        if (chkWorkspaceName.isEnabled()) {

            throw new RuntimeException("User is allowed to hide workspace name in workspace table");

        } else {

            System.out.println("Workspace name is disabled in settings");

        }
    }

    @Override
    public void navigateToCatalogList(WebElement btnConnectivity,WebElement btnCatalog) {

        waitToClick(driver, 10, btnConnectivity);
        btnConnectivity.click();

        waitToClick(driver, 10, btnCatalog);
        btnCatalog.click();

    }

    @Override
    public void clickCatalogSettings(WebElement btnSettings) {

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

    }

    @Override
    public void verifyCatalogNameDisableInSettings(WebElement chkCatalogName) {

        if (chkCatalogName.isEnabled()) {

            throw new RuntimeException("User is allowed to hide catalog name in catalog table");

        } else {

            System.out.println("catalog name is disabled in settings");

        }

    }

    @Override
    public void navigateToClusterList(WebElement btnConnectivity, WebElement btnCluster) {

        waitToClick(driver, 10, btnConnectivity);
        btnConnectivity.click();

        waitToClick(driver, 10, btnCluster);
        btnCluster.click();

    }

    @Override
    public void clickClusterSettings(WebElement btnSettings) {

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

    }

    @Override
    public void verifyClusterNameDisableInSettings(WebElement chkClusterName) {

        if (chkClusterName.isEnabled()){

            throw new RuntimeException("User is allowed to hide cluster name in catalog table");

        } else  {

            System.out.println("Cluster name is disabled in settings");

        }
    }
}
