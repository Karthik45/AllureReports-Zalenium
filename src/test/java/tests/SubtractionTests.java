package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ArithmeticCalculationPage;
import utils.Categories;
import utils.TestListener;

@Listeners({TestListener.class})
@Epic("Subtraction")
@Feature("Subtraction Test Cases")
public class SubtractionTests extends BaseTest {

    ArithmeticCalculationPage cal = new ArithmeticCalculationPage();

    @Test(description = "Sample Test to check subtraction of two numbers.", groups = {Categories.MINUS})
    public void test1() {
        cal.subtraction(3, 2, driver);
        cal.checkResultForAddition(1, driver);
    }

    @Test(description = "Sample Test to check subtraction of two numbers.", groups = {Categories.MINUS})
    public void test2() {
        cal.subtraction(2, 2, driver);
        cal.checkResultForAddition(0, driver);
    }

    @Test(description = "Sample Test to check subtraction of two numbers.", groups = {Categories.MINUS})
    public void test3() {
        cal.subtraction(2, 6, driver);
        cal.checkResultForAddition(0, driver);
    }
}
