package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;

public class BasePage {

    protected void waitForElementToBeVisible(WebElement element) {
        await().atMost(30, TimeUnit.SECONDS);
    }

    protected void waitForElementToBeClickable(WebElement element) {
        await().atMost(30, TimeUnit.SECONDS);
    }

    protected void sendKeys(WebElement element, String value) {
        waitForElementToBeVisible(element);
        waitForElementToBeClickable(element);
        element.clear();
        element.sendKeys(value);
    }

    protected boolean matchText(WebElement element, String valueToMatch) {
        return element.getText().contains(valueToMatch);
    }


    protected void selectValue(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }

    protected void clickOnButton(WebElement element) {
        waitForElementToBeVisible(element);
        waitForElementToBeClickable(element);
        element.click();
    }
}
