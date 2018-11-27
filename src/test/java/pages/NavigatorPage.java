package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;
import static org.testng.Assert.fail;

public class NavigatorPage extends BasePage {


    @Step("Navigating to url: {0}")
    public void navigateTo(String url, WebDriver driver) {
        driver.navigate().to(url);
        await().atMost(30, TimeUnit.SECONDS).until(() -> driver.getCurrentUrl().contains(url));
    }

    public void failTest() {
        fail("Failing the Test Case");
    }
}
