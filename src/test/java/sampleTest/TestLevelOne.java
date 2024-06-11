package sampleTest;

import Pages.Level1.Workspace;
import org.testng.annotations.*;
import Base.BaseLevel1;
import Pages.Level1.Catalog;
import Pages.Level1.Cluster;

public class TestLevelOne extends BaseLevel1 {

    Workspace workspace = null;
    Catalog catalog = null;
    Cluster cluster = null;

    @BeforeMethod
    public void setup() {

        loginE6data();
        workspace = new Workspace();
        catalog = new Catalog();
        cluster = new Cluster();

    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }

    @Test(priority = 1)
    public void workspaceTest() {

        workspace.verifyWorkspaceSettings();

    }

    @Test(priority = 2)
    public void catalogTest() {

        catalog.verifyCatalogSettings();

    }

    @Test(priority = 3)
    public void clusterTest() {

        cluster.verifyClusterSettings();

    }


}
