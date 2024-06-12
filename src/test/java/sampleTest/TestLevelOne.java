package sampleTest;

import Pages.Level1.Workspace;
import org.testng.annotations.*;
import Base.BaseLevel1;
import Pages.Level1.*;

public class TestLevelOne extends BaseLevel1 {

    Workspace workspace = null;
    Catalog catalog = null;
    Cluster cluster = null;
    Login login = null;


    @BeforeMethod
    public void setup() {

        launchE6data();
        workspace = new Workspace();
        catalog = new Catalog();
        cluster = new Cluster();
        login = new Login();

    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }

    @Test(priority = 1)
    public void loginTest(){

        login.loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");

    }

    @Test(priority = 2)
    public void workspaceTest() {

        login.loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");

        workspace.clickWorkspaceSettings();
        workspace.verifyWorkspaceNameDisableInSettings();

    }

    @Test(priority = 3)
    public void catalogTest() {

        login.loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");

        workspace.selectWorkspace("plt-beta");

        catalog.navigateToCatalogList();
        catalog.clickCatalogSettings();
        catalog.verifyCatalogNameDisableInSettings();
    }

    @Test(priority = 4)
    public void clusterTest() {

        login.loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");

        workspace.selectWorkspace("plt-beta");

        cluster.navigateToClusterList();
        cluster.clickClusterSettings();
        cluster.verifyClusterNameDisableInSettings();

    }


}
