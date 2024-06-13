package Pages.Level4;

import Base.BaseLevel3;
import Base.BaseLevel4;
import org.openqa.selenium.support.PageFactory;

public class Modules extends BaseLevel4 {

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
