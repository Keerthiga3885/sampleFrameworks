package Pages.Level1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseLevel1;

public class Workspace extends BaseLevel1 {


    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id="workspace_name")
    WebElement chkWorkspaceName;

    public Workspace(){

        PageFactory.initElements(driver, this);

    }


    public void verifyWorkspaceSettings()  {

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

        if (chkWorkspaceName.isEnabled()){

            throw new RuntimeException("User is allowed to hide workspace name in workspace table");

        }
        else  {

            System.out.println("Workspace name is disabled in settings");

        }

    }

}
