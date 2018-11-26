package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ArithmeticCalculationPage;
import utils.Categories;
import utils.TestListener;

@Listeners({TestListener.class})
@Epic("Multiplication")
@Feature("Multiplication Test Cases")
public class MultiplicationTests extends BaseTest {

    ArithmeticCalculationPage cal = new ArithmeticCalculationPage();

    @Test(description = "Sample Test to check multiplication of two numbers.", groups = {Categories.MULTIPLY})
    public void test1() {
        cal.multiplication(2, 3, driver);
        cal.checkResultForAddition(6, driver);
    }

    @Test(description = "Sample Test to check multiplication of two numbers.", groups = {Categories.MULTIPLY})
    @Severity(SeverityLevel.NORMAL)
    public void test2() {
        cal.multiplication(4, 5, driver);
        cal.checkResultForAddition(10, driver);
    }

    @Test(description = "Sample Test to check multiplication of two numbers.", groups = {Categories.MULTIPLY})
    public void test3() {
        cal.multiplication(5, 8, driver);
        cal.checkResultForAddition(40, driver);
    }
}
