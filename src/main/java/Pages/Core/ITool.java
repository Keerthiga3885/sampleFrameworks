package Pages.Core;

import org.openqa.selenium.WebElement;

public interface ITool {

    public void loginToE6data(WebElement element1, WebElement element2, WebElement element3,String username, String password);

    public void selectWorkspace(String workspace);
    public void clickWorkspaceSettings(WebElement element);
    public void verifyWorkspaceNameDisableInSettings(WebElement element);

    public void navigateToCatalogList(WebElement element1,WebElement element2);
    public void clickCatalogSettings(WebElement element);
    public void verifyCatalogNameDisableInSettings(WebElement element);

    public void navigateToClusterList(WebElement element1,WebElement element2);
    public void clickClusterSettings(WebElement element);
    public void verifyClusterNameDisableInSettings(WebElement element);









    }
