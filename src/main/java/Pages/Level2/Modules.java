package Pages.Level2;

import org.openqa.selenium.support.PageFactory;

public class Modules extends Base.BaseLevel2 {

    public static Login Login() {

        return PageFactory.initElements(driver, Login.class);

    }

    public static Workspace Workspace() {

        return PageFactory.initElements(driver, Workspace.class);

    }

    public static Catalog Catalog() {

        return PageFactory.initElements(driver, Catalog.class);

    }

    public static Cluster Cluster() {

        return PageFactory.initElements(driver, Cluster.class);

    }

}
