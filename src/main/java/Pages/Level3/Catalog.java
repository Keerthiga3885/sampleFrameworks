package Pages.Level3;

import Base.BaseLevel3;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Catalog extends BaseLevel3 {

    @FindBy(xpath = "//a[text()='plt-beta']")
    WebElement lnkworkspace;

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

    public void navigateToCatalogList(){

        wrapper.navigateToCatalogList(btnConnectivity,btnCatalog);
    }

    public void clickCatalogSettings(){

      wrapper.clickCatalogSettings(btnSettings);

    }

    public void verifyCatalogNameDisableInSettings() {

       wrapper.verifyCatalogNameDisableInSettings(chkCatalogName);

    }

}
