package Workflows.e6DataWorkflows;

import Pages.Level4.Modules;
import TestData.PlatformData;

public class NavigateToClusterList {

    public void NavigateToClusterList() {

        PlatformData platformData = new PlatformData();

        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(),platformData.getLoginData().getPassword());
        Modules.Workspace().selectWorkspace(platformData.getWorkspaceData().getWorkspaceName());
        Modules.Cluster().clickClusterOption();

    }

}
