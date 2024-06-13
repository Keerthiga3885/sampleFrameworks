package sampleTest;

import Base.BaseLevel4;
import Pages.Level4.Modules;
import TestData.PlatformData;
import Workflows.Workflows;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestLevelFour extends BaseLevel4 {
    PlatformData platformData = new PlatformData();


    @AfterMethod
    public void tearDown() {

        // Close browser driver
        closeDriver();

    }

    @Test()
    public void loginTest() {

        // Login to e6data
        launchE6data();

        Modules.Login().loginToE6data(platformData.getLoginData().getUserName(), platformData.getLoginData().getPassword());

    }

    @Test()
    public void workspaceTest() {

        // Navigate to workspace list screen
        Workflows.WorkspaceWF().NavigateToWorkspaceList();

        // Click workspace settings button
        Modules.Workspace().clickWorkspaceSettings();

        // Verify workspace name in settings is disabled
        Modules.Workspace().verifyWorkspaceNameDisableInSettings();
    }

    @Test(priority = 3)
    public void catalogTest() {

        //Navigate to catalog list screen
        Workflows.CatalogWF().NavigateToCatalogList();

        // Click catalog settings button
        Modules.Catalog().clickCatalogSettings();

        // Verify catalog name in settings is disabled
        Modules.Catalog().verifyCatalogNameDisableInSettings();
    }

    @Test(priority = 4)
    public void clusterTest() {

        //Navigate to cluster list screen
        Workflows.ClusterWF().NavigateToClusterList();

        // Click cluster settings button
        Modules.Cluster().clickClusterSettings();

        // Verify cluster name in settings is disabled
        Modules.Cluster().verifyClusterNameDisableInSettings();

    }

}
