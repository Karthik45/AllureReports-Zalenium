package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I am in onTestFailure method " + getTestMethodName(result) + "failed");

        Object testClass = result.getInstance();
        WebDriver driver = ((BaseTest) testClass).getDriver();

        if (driver instanceof WebDriver) {
            System.out.println("ScreenShot Captured for test case: " + getTestMethodName(result));
            saveScreenshotPNG(driver);
        }

        saveTextLog(getTestMethodName(result) + " failed and captured screenshot");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Attachment(value = "Page ScreenShot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "value/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    private static String getTestMethodName(ITestResult result) {
        return result.getMethod().getConstructorOrMethod().getName();
    }
}
