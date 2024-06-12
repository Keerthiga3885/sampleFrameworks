package Pages.Level1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseLevel1;

public class Catalog extends BaseLevel1 {

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

        waitToClick(driver, 10, btnConnectivity);
        btnConnectivity.click();

        waitToClick(driver, 10, btnCatalog);
        btnCatalog.click();

    }

    public void clickCatalogSettings(){

        waitToClick(driver, 10, btnSettings);
        btnSettings.click();

    }

    public void verifyCatalogNameDisableInSettings() {

        if (chkCatalogName.isEnabled()) {

            throw new RuntimeException("User is allowed to hide catalog name in catalog table");

        } else {

            System.out.println("catalog name is disabled in settings");

        }

    }

}
