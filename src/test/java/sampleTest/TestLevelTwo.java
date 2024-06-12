package sampleTest;

import Base.BaseLevel2;
import Pages.Level2.Modules;
import org.testng.annotations.*;

public class TestLevelTwo extends BaseLevel2 {

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
        Modules.Catalog().navigateToCatalogList();
        Modules.Catalog().clickCatalogSettings();
        Modules.Catalog().verifyCatalogNameDisableInSettings();
    }

    @Test(priority = 4)
    public void clusterTest() {

        Modules.Login().loginToE6data("keerthiga.murugan@e6x.io", "Tinku123*");
        Modules.Workspace().selectWorkspace("plt-beta");
        Modules.Cluster().navigateToClusterList();
        Modules.Cluster().clickClusterSettings();
        Modules.Cluster().verifyClusterNameDisableInSettings();

    }


}
