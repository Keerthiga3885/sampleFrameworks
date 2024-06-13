package Workflows.e6DataWorkflows;

import Pages.Level4.Modules;
import TestData.PlatformData;

public class NavigateToCatalogList {

    public void NavigateToCatalogList() {

        PlatformData platformData = new PlatformData();

        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(),platformData.getLoginData().getPassword());
        Modules.Workspace().selectWorkspace(platformData.getWorkspaceData().getWorkspaceName());
        Modules.Catalog().clickCatalogOption();

    }

}
