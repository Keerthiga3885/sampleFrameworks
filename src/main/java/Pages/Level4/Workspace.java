package Pages.Level4;

import Base.BaseLevel3;
import Base.BaseLevel4;
import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Workspace extends BaseLevel4 {


    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id = "workspace_name")
    WebElement chkWorkspaceName;

    public Workspace() {

        PageFactory.initElements(Driver.getDriver(), this);

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
