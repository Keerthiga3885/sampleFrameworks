package Pages.Level4;

import Base.BaseLevel3;
import Base.BaseLevel4;
import Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class Modules extends BaseLevel4 {

    public static Login Login() {

        return PageFactory.initElements(Driver.getDriver(), Login.class);

    }

    public static Workspace Workspace() {

        return PageFactory.initElements(Driver.getDriver(), Workspace.class);

    }

    public static Catalog Catalog() {

        return PageFactory.initElements(Driver.getDriver(), Catalog.class);

    }

    public static Cluster Cluster() {

        return PageFactory.initElements(Driver.getDriver(), Cluster.class);

    }

}
