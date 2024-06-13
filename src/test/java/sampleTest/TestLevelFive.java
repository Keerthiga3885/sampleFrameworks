package sampleTest;

import Base.BaseLevel4;
import Pages.Level4.Modules;
import Utils.Excel;
import Workflows.Workflows;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestLevelFive extends BaseLevel4 {


    @BeforeSuite
    public void fileSetup() throws IOException {

        // Clear old results
        FileUtils.deleteDirectory(new File("test-output"));

        // Create Test-Output directory to store results
        FileUtils.forceMkdir(new File("test-output"));

        // Copy test data file to write test results
        FileUtils.copyFile(new File("src/main/resources/e6TestData.xlsx"), new File("test-output/e6TestOutput.xlsx"));

    }


   @AfterMethod
    public void tearDown() {

        // Close browser driver
        closeDriver();

    }

    @Test(dataProvider = "E6TestData", dataProviderClass = Excel.class,priority = 1)
    public void loginTest(String userName, String password) {

        // Login to e6data
        launchE6data();

        Modules.Login().loginToE6data(userName, password);

    }

    @Test(priority = 2)
    public void workspaceTest() {

        // Navigate to workspace list screen
        Workflows.WorkspaceWF().NavigateToWorkspaceList();

        // Click workspace settings button
        Modules.Workspace().clickWorkspaceSettings();

        // Verify workspace name in settings is disabled
        Modules.Workspace().verifyWorkspaceNameDisableInSettings();
    }

    @Test(dataProvider = "E6TestData", dataProviderClass = Excel.class,priority = 3)
    public void catalogTest(String workspaceName) {

        //Navigate to catalog list screen
        Workflows.CatalogWF().NavigateToCatalogList1(workspaceName);

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
