package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

import static Utils.Config.BROWSER;


public class Driver {
    private static InheritableThreadLocal<WebDriver> inheritableThreadLocalDriver
            = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        if(inheritableThreadLocalDriver.get()==null)
        {
            inheritableThreadLocalDriver.set(ThreadGuard.protect(DriverFactory.initiatliseDriver(Config.getConfig(BROWSER))));
            return inheritableThreadLocalDriver.get();
        }
        return inheritableThreadLocalDriver.get();
    }

    public static void closeDriver()
    {
        if(inheritableThreadLocalDriver.get()!=null){
            inheritableThreadLocalDriver.get().quit();
            inheritableThreadLocalDriver.set(null);
        }
    }

}

