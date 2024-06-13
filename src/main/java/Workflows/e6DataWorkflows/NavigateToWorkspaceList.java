package Workflows.e6DataWorkflows;

import Pages.Level4.Modules;
import TestData.PlatformData;

public class NavigateToWorkspaceList {

    public void NavigateToWorkspaceList() {

        PlatformData platformData = new PlatformData();
        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(),platformData.getLoginData().getPassword());

    }

}
