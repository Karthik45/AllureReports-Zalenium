package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SamplePage;
import utils.Listerners.TestListener;

@Listeners({TestListener.class})
@Epic("Sample")
@Feature("Sample Tests")
public class SampleTest extends BaseTest {

    private SamplePage samplePage = new SamplePage();

    @Test(description = "Sample Test to check addition of two numbers.")
    public void test1() {
        samplePage.addition(2, 3, driver);
        samplePage.checkResultForAddition(5, driver);
    }

    @Test(description = "Sample Test to check multiplication of two numbers.")
    public void test2() {
        samplePage.multiplication(2, 3, driver);
        samplePage.checkResultForAddition(6, driver);
    }

    @Test(description = "Sample Test to check subtraction of two numbers.")
    public void test3() {
        samplePage.subtraction(3, 2, driver);
        samplePage.checkResultForAddition(2, driver);
    }
}
