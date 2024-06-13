package Pages.Level4;

import Base.BaseLevel3;
import Base.BaseLevel4;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cluster extends BaseLevel4 {

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

    public void clickClusterOption (){

       wrapper.clickClusterOption(btnConnectivity,btnCluster);

    }

    public void clickClusterSettings(){

       wrapper.clickClusterSettings(btnSettings);
    }

    public void verifyClusterNameDisableInSettings() {

        wrapper.verifyClusterNameDisableInSettings(chkClusterName);
    }


}
