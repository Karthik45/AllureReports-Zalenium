package utils;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class LocalDriver {

    private WebDriver webDriver;

    public LocalDriver() {
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        System.out.println("Browser to be tested on == " + browser);
        try {
            setBrowserProperties(browser);
            launchBrowser(browser);
        } catch (Exception e) {
            e.printStackTrace();
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
        switch (browser) {
            case "chrome":
                String mode = System.getProperty("mode") == null ? "local" : System.getProperty("mode");
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
                switch (System.getProperty("mode")) {
                    case "cloud":
                        DesiredCapabilities firefoxCaps = DesiredCapabilities.firefox();
                        webDriver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), firefoxCaps);
                        break;
                    case "local":
                        webDriver = new ChromeDriver();
                        break;
                }
            default:
                throw new Exception("Not a valid browser");
        }
    }

    private void setChromeDriverBasedOnOperatingSystem() {
        if (isWindows()) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromeDriverWin.exe");
        }
        if (isMac()) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromeDriverMac");
        }
        if (isLinux()) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromeDriverlin");
        }
    }

    private void setFirefoxDriverBasedOnOperatingSystem() {
        if (isWindows()) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriverWin.exe");
        }
        if (isMac()) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriverMac");
        }
        if (isLinux()) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriverLin");
        }
    }

    public WebDriver getDriver() {
        return webDriver;
    }

    private boolean isWindows() {
        return SystemUtils.IS_OS_WINDOWS;
    }

    private boolean isLinux() {
        return SystemUtils.IS_OS_LINUX;
    }

    private boolean isMac() {
        return SystemUtils.IS_OS_MAC;
    }
}
