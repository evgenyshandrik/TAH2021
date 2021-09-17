package util.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.grid.config.EnvConfig;

public class Config {
    private static final Properties properties = new Properties();
    
    private Config() {
    }
    
    static {
        try {
            InputStream is = EnvConfig.class.getResourceAsStream("/config.properties");
            properties.load(is);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
    
    public static String getValue(String value) {
        return properties.getProperty(value);
    }
}
