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

    @Test(description = "Navigating to Amazon About", groups = {Categories.AMAZON, Categories.SANITY})
    public void test1() {
        page.navigateTo("https://www.aboutamazon.in/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon Jobs", groups = {Categories.AMAZON, Categories.SANITY})
    public void test2() {
        page.navigateTo("https://www.amazon.jobs/en-gb", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon Advertise page", groups = {Categories.AMAZON, Categories.SANITY})
    public void test3() {
        page.navigateTo("https://advertising.amazon.in/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon Pay", groups = {Categories.AMAZON, Categories.SANITY})
    public void test4() {
        page.navigateTo("https://www.amazonpay.in", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Amazon India", groups = {Categories.AMAZON, Categories.SANITY, Categories.SMOKE})
    public void test5() {
        page.navigateTo(url, driver);
        page.failTest();
    }
}
