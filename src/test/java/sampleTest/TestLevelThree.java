package sampleTest;

import Base.BaseLevel3;
import Pages.Level3.Modules;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLevelThree extends BaseLevel3 {

    @BeforeMethod
    public void setup() {

        launchE6data();

    }

    @AfterMethod
    public void tearDown() {

        closeDriver();

    }

    @Test(priority = 1)
    public void loginTest() {

        Modules.Login().loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");

    }

    @Test(priority = 2)
    public void workspaceTest() {

        Modules.Login().loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");
        Modules.Workspace().clickWorkspaceSettings();
        Modules.Workspace().verifyWorkspaceNameDisableInSettings();
    }

    @Test(priority = 3)
    public void catalogTest() {

        Modules.Login().loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");
        Modules.Workspace().selectWorkspace("plt-beta");
        Modules.Catalog().clickCatalogOption();
        Modules.Catalog().clickCatalogSettings();
        Modules.Catalog().verifyCatalogNameDisableInSettings();
    }

    @Test(priority = 4)
    public void clusterTest() {

        Modules.Login().loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");
        Modules.Workspace().selectWorkspace("plt-beta");
        Modules.Cluster().clickClusterOption();
        Modules.Cluster().clickClusterSettings();
        Modules.Cluster().verifyClusterNameDisableInSettings();

    }

}
