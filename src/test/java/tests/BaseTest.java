package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.LocalDriver;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeScenario() {
        driver = new LocalDriver().getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void afterScenario() {
        driver.quit();
    }
}
