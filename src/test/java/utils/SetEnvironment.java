package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetEnvironment {

    public SetEnvironment() throws IOException {
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        String tags = System.getProperty("tags") == null ? "sanity" : System.getProperty("tags");
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/build/allure-results/environment.properties");
        Properties props = new Properties();
        props.setProperty("browser", browser);
        props.setProperty("tags", tags);
        props.store(fos, "Added Properties file");
        fos.close();
    }
}
