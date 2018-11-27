package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import utils.InvalidBrowserException;
import utils.LocalDriver;
import utils.SetEnvironment;

import java.io.IOException;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true, description = "Setting Driver to run tests")
    public void beforeScenario() throws InvalidBrowserException {
        driver = new LocalDriver().getDriver();
    }

    @AfterMethod(alwaysRun = true, description = "Killing Driver after tests")
    public void afterScenario() {
        driver.quit();
    }

    @AfterSuite(alwaysRun = true)
    public void setEnv() throws IOException {
        new SetEnvironment();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
