package Workflows.e6DataWorkflows;

import Base.BaseLevel4;
import Pages.Level4.Modules;
import TestData.PlatformData;

public class NavigateToCatalogList extends BaseLevel4 {

    public void NavigateToCatalogList() {

        PlatformData platformData = new PlatformData();
        launchE6data();

        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(),platformData.getLoginData().getPassword());
        Modules.Workspace().selectWorkspace(platformData.getWorkspaceData().getWorkspaceName());
        Modules.Catalog().clickCatalogOption();

    }
    public void NavigateToCatalogList1(String workspaceName) {

        PlatformData platformData = new PlatformData();
        launchE6data();

        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(),platformData.getLoginData().getPassword());
        Modules.Workspace().selectWorkspace(workspaceName);
        Modules.Catalog().clickCatalogOption();

    }

}
