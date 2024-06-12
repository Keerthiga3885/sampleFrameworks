package Pages.Level2;

import Base.BaseLevel1;
import Base.BaseLevel2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cluster extends BaseLevel2 {

    @FindBy(xpath = "//a[text()='plt-beta']")
    WebElement lnkworkspace;

    @FindBy(id = "Connectivity")
    WebElement btnConnectivity;

    @FindBy(xpath="//span[@class='name-label ' and text()='Clusters']")
    WebElement btnCluster;

    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id = "cluster_name")
    WebElement chkClusterName;

    public Cluster(){

        PageFactory.initElements(driver, this);

    }

    public void navigateToClusterList(){

        waitToClick(driver, 10, btnConnectivity);
        btnConnectivity.click();

        waitToClick(driver, 10, btnCluster);
        btnCluster.click();

    }

    public void clickClusterSettings(){

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

    }

    public void verifyClusterNameDisableInSettings() {

        if (chkClusterName.isEnabled()){

            throw new RuntimeException("User is allowed to hide cluster name in catalog table");

        } else  {

            System.out.println("Cluster name is disabled in settings");

        }

    }


}
