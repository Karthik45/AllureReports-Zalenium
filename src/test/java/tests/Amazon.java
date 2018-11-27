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
@Feature("Amazon")
public class Amazon extends BaseTest {
    private NavigatorPage page = new NavigatorPage();
    private String url = SiteUrl.amazon;

    @Test(description = "Navigating to Amazon", groups = {Categories.AMAZON, Categories.SANITY})
    public void test1() {
        page.navigateTo(url, driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon", groups = {Categories.AMAZON, Categories.SANITY})
    public void test2() {
        page.navigateTo(url, driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon", groups = {Categories.AMAZON, Categories.SANITY})
    public void test3() {
        page.navigateTo(url, driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon", groups = {Categories.AMAZON, Categories.SANITY})
    public void test4() {
        page.navigateTo(url, driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon", groups = {Categories.AMAZON, Categories.SANITY})
    public void test5() {
        page.navigateTo(url, driver);
        page.failTest();
    }
}
