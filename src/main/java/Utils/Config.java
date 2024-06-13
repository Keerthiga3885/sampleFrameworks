package Utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.Configuration;


public class Config {

    private static Configuration configuration = null;

    public static final String BROWSER = "browser";

    static {

        try {
            configuration = new PropertiesConfiguration("input.properties");
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getConfig(String key){

        return configuration.getString(key);

    }

}
