package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class ArithmeticCalculationPage extends BasePage {

    @Step("Doing addition for numbers {0} and {1}")
    public void addition(int first, int second, WebDriver driver) {
        driver.navigate().to("https://www.google.com/");
        sendKeys(driver.findElement(By.cssSelector("input[title='Search']")), first + "+" + second);
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
    }

    @Step("Doing multiplication for numbers {0} and {1}")
    public void multiplication(int first, int second, WebDriver driver) {
        driver.navigate().to("https://www.google.com/");
        sendKeys(driver.findElement(By.cssSelector("input[title='Search']")), first + "*" + second);
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
    }

    @Step("Doing subtraction for numbers {0} and {1}")
    public void subtraction(int first, int second, WebDriver driver) {
        driver.navigate().to("https://www.google.com/");
        sendKeys(driver.findElement(By.cssSelector("input[title='Search']")), first + "-" + second);
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
    }

    @Step("Result should match with {0}")
    public void checkResultForAddition(int result, WebDriver driver) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(driver.findElement(By.cssSelector("#cwotbl")).getText().trim(), String.valueOf(result), "Result is wrong.");
    }
}
