package Pages.Level3;

import org.openqa.selenium.WebDriver;

public class Selenium implements ITool{

    WebDriver driver;

    public Selenium(WebDriver driver){

        driver = this.driver;

    }


    @Override
    public void loginToE6data(String username, String password) {

    }

    @Override
    public void selectWorkspace(String workspace) {

    }

    @Override
    public void clickWorkspaceSettings() {

    }

    @Override
    public void verifyWorkspaceNameDisableInSettings() {

    }

    @Override
    public void navigateToCatalogList() {

    }

    @Override
    public void clickCatalogSettings() {

    }

    @Override
    public void verifyCatalogNameDisableInSettings() {

    }

    @Override
    public void navigateToClusterList() {

    }

    @Override
    public void clickClusterSettings() {

    }

    @Override
    public void verifyClusterNameDisableInSettings() {

    }
}
