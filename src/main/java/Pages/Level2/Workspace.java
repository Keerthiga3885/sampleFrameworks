package Pages.Level2;

import Base.BaseLevel2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Workspace extends BaseLevel2 {


    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id = "workspace_name")
    WebElement chkWorkspaceName;

    public Workspace() {

        PageFactory.initElements(driver, this);

    }

    public void selectWorkspace(String workspace) {

        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + workspace + "']"))).click();

    }

    public void clickWorkspaceSettings(){

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

    }

    public void verifyWorkspaceNameDisableInSettings() {

        if (chkWorkspaceName.isEnabled()) {

            throw new RuntimeException("User is allowed to hide workspace name in workspace table");

        } else {

            System.out.println("Workspace name is disabled in settings");

        }

    }

}
package Pages.Level2;

import Base.BaseLevel2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Workspace extends BaseLevel2 {

    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id = "workspace_name")
    WebElement chkWorkspaceName;

    public Workspace() {

        PageFactory.initElements(driver, this);

    }


    public void verifyWorkspaceSettings() {

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

        if (chkWorkspaceName.isEnabled()) {

            throw new RuntimeException("User is allowed to hide workspace name in workspace table");

        } else {

            System.out.println("Workspace name is disabled in settings");

        }

    }

}
