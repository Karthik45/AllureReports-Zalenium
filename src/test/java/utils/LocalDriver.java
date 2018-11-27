package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class LocalDriver {

    private WebDriver webDriver;

    public LocalDriver() throws InvalidBrowserException {
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        System.out.println("Browser to be tested on == " + browser);
        try {
            setBrowserProperties(browser);
            launchBrowser(browser);
        } catch (Exception e) {
            throw new InvalidBrowserException(browser);
        }
    }

    private void setBrowserProperties(String browser) throws Exception {
        switch (browser) {
            case "chrome":
                setChromeDriverBasedOnOperatingSystem();
                break;
            case "firefox":
                setFirefoxDriverBasedOnOperatingSystem();
                break;
            default:
                throw new Exception("Not a valid browser");
        }
    }

    private void launchBrowser(String browser) throws Exception {
        String mode = System.getProperty("mode") == null ? "local" : System.getProperty("mode");
        switch (browser) {
            case "chrome":
                switch (mode) {
                    case "cloud":
                        DesiredCapabilities chromeCaps = DesiredCapabilities.chrome();
                        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCaps);
                        break;
                    case "local":
                        webDriver = new ChromeDriver();
                        break;
                }
                break;
            case "firefox":
                switch (mode) {
                    case "cloud":
                        DesiredCapabilities firefoxCaps = DesiredCapabilities.firefox();
                        webDriver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), firefoxCaps);
                        break;
                    case "local":
                        webDriver = new FirefoxDriver();
                        break;
                }
                break;
            default:
                throw new Exception("Not a valid browser");
        }
    }

    private void setChromeDriverBasedOnOperatingSystem() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver");
    }

    private void setFirefoxDriverBasedOnOperatingSystem() {
        System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver");

    }

    public WebDriver getDriver() {
        return webDriver;
    }
}
