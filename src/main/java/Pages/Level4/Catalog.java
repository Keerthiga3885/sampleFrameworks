package Pages.Level4;

import Base.BaseLevel3;
import Base.BaseLevel4;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog extends BaseLevel4 {


    @FindBy(id = "Connectivity")
    WebElement btnConnectivity;

    @FindBy(id = "OpenBook")
    WebElement btnCatalog;

    @FindBy(id = "settings")
    WebElement btnSettings;

    @FindBy(id = "name")
    WebElement chkCatalogName;

    public Catalog() {

        PageFactory.initElements(driver, this);

    }

    public void clickCatalogOption(){

        wrapper.clickCatalogOption(btnConnectivity,btnCatalog);
    }

    public void clickCatalogSettings(){

      wrapper.clickCatalogSettings(btnSettings);

    }

    public void verifyCatalogNameDisableInSettings() {

       wrapper.verifyCatalogNameDisableInSettings(chkCatalogName);

    }

}
