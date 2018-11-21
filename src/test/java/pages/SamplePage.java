package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class SamplePage extends BasePage {

    @Step("Addition")
    public void addition(int first, int second, WebDriver driver) {
        driver.navigate().to("https://www.google.com/");
        sendKeys(driver.findElement(By.cssSelector("input[title='Search']")), first + "+" + second);
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
    }

    @Step("Multiplication")
    public void multiplication(int first, int second, WebDriver driver) {
        driver.navigate().to("https://www.google.com/");
        sendKeys(driver.findElement(By.cssSelector("input[title='Search']")), first + "*" + second);
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
    }

    @Step("Subtraction")
    public void subtraction(int first, int second, WebDriver driver) {
        driver.navigate().to("https://www.google.com/");
        sendKeys(driver.findElement(By.cssSelector("input[title='Search']")), first + "-" + second);
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
    }

    @Step("Result")
    public void checkResultForAddition(int result, WebDriver driver) {
        assertEquals(driver.findElement(By.cssSelector("#cwotbl")).getText().trim(), String.valueOf(result), "Result is wrong.");
    }
}
