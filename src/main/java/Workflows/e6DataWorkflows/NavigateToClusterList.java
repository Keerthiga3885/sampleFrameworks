package Workflows.e6DataWorkflows;

import Base.BaseLevel4;
import Pages.Level4.Modules;
import TestData.PlatformData;

public class NavigateToClusterList extends BaseLevel4 {

    public void NavigateToClusterList() {

        PlatformData platformData = new PlatformData();
        launchE6data();

        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(),platformData.getLoginData().getPassword());
        Modules.Workspace().selectWorkspace(platformData.getWorkspaceData().getWorkspaceName());
        Modules.Cluster().clickClusterOption();

    }

}
