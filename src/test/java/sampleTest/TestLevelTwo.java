package sampleTest;

import Base.BaseLevel2;
import Pages.Level2.Modules;
import org.testng.annotations.*;

public class TestLevelTwo extends BaseLevel2 {

    @BeforeMethod
    public void setup() {

        loginE6data();

    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }

    @Test(priority = 1)
    public void workspaceTest() {

        Modules.Workspace().verifyWorkspaceSettings();

    }

    @Test(priority = 2)
    public void catalogTest() {

        Modules.Catalog().verifyCatalogSettings();

    }

    @Test(priority = 3)
    public void clusterTest() {

        Modules.Cluster().verifyClusterSettings();

    }


}
