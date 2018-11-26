package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.LocalDriver;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true, description = "Setting Driver to run tests")
    public void beforeScenario() {
        driver = new LocalDriver().getDriver();
    }

    @AfterMethod(alwaysRun = true, description = "Killing Driver after tests")
    public void afterScenario() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
