package Pages.Level3;

import Base.BaseLevel3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Workspace extends BaseLevel3 {


    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id = "workspace_name")
    WebElement chkWorkspaceName;

    public Workspace() {

        PageFactory.initElements(driver, this);

    }

    public void selectWorkspace(String workspace) {

        wrapper.selectWorkspace(workspace);
    }

    public void clickWorkspaceSettings() {

        wrapper.clickWorkspaceSettings(btnSettings);
    }

    public void verifyWorkspaceNameDisableInSettings() {

       wrapper.verifyWorkspaceNameDisableInSettings(chkWorkspaceName);

    }

}
