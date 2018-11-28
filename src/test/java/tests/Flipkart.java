package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.NavigatorPage;
import utils.Categories;
import utils.SiteUrl;
import utils.TestListener;

@Listeners({TestListener.class})
@Epic("Navigating to some urls")
@Feature("Flipkart")
public class Flipkart extends BaseTest {

    private NavigatorPage page = new NavigatorPage();
    private String url = SiteUrl.flipkart;

    @Test(description = "Navigating to Flipkart About us Page", groups = {Categories.FLIPKART, Categories.SANITY, Categories.SMOKE})
    public void test1() {
        page.navigateTo("https://www.flipkart.com/about-us", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Flipkart Careers", groups = {Categories.FLIPKART, Categories.SANITY})
    public void test2() {
        page.navigateTo("http://www.flipkartcareers.com", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Flipkart Stories Page", groups = {Categories.FLIPKART, Categories.SANITY})
    public void test3() {
        page.navigateTo("http://www.stories.flipkart.com", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Flipkart Payments Page", groups = {Categories.FLIPKART, Categories.SANITY})
    public void test4() {
        page.navigateTo("https://www.flipkart.com/pages/payments", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Flipkart Shipping Page", groups = {Categories.FLIPKART, Categories.SANITY})
    public void test5() {
        page.navigateTo("https://www.flipkart.com/pages/shipping", driver);
        page.failTest();
    }
}
