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
@Feature("Swiggy")
public class Swiggy extends BaseTest {

    private NavigatorPage page = new NavigatorPage();
    private String url = SiteUrl.swiggy;

    @Test(description = "Navigating to Swiggy in hyderabad", groups = {Categories.SWIGGY, Categories.SANITY})
    public void test1() {
        page.navigateTo(url + "/hyderabad", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Swiggy in bangalore", groups = {Categories.SWIGGY, Categories.SANITY, Categories.SMOKE})
    public void test2() {
        page.navigateTo(url + "/bangalore", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Swiggy in chennai", groups = {Categories.SWIGGY, Categories.SANITY})
    public void test3() {
        page.navigateTo(url + "/chennai", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Swiggy in mumbai", groups = {Categories.SWIGGY, Categories.SANITY})
    public void test4() {
        page.navigateTo(url + "/mumbai", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Swiggy in kolkata", groups = {Categories.SWIGGY, Categories.SANITY})
    public void test5() {
        page.navigateTo(url + "/kolkata", driver);
        page.failTest();
    }
}
