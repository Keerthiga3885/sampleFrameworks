package Pages.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wrapper implements ITool {

    private ITool iTool = null;

    public Wrapper(WebDriver driver) {
        iTool = new Selenium(driver);
    }

    @Override
    public void loginToE6data(WebElement element1, WebElement element2, WebElement element3,String username, String password) {

        iTool.loginToE6data(element1, element2, element3, username, password);
    }

    @Override
    public void selectWorkspace(String workspace) {
        iTool.selectWorkspace(workspace);
    }

    @Override
    public void clickWorkspaceSettings(WebElement element) {
        iTool.clickWorkspaceSettings(element);
    }

    @Override
    public void verifyWorkspaceNameDisableInSettings(WebElement element) {
        iTool.verifyWorkspaceNameDisableInSettings(element);
    }

    @Override
    public void navigateToCatalogList(WebElement element1, WebElement element2) {
        iTool.navigateToCatalogList(element1, element2);
    }

    @Override
    public void clickCatalogSettings(WebElement element) {
        iTool.clickCatalogSettings(element);
    }

    @Override
    public void verifyCatalogNameDisableInSettings(WebElement element) {
        iTool.verifyCatalogNameDisableInSettings(element);
    }

    @Override
    public void navigateToClusterList(WebElement element1, WebElement element2) {
        iTool.navigateToClusterList(element1, element2);
    }

    @Override
    public void clickClusterSettings(WebElement element) {
        iTool.clickClusterSettings(element);
    }

    @Override
    public void verifyClusterNameDisableInSettings(WebElement element) {
        iTool.verifyClusterNameDisableInSettings(element);
    }
}
