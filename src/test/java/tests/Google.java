package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.NavigatorPage;
import utils.Categories;
import utils.SiteUrl;
import utils.TestListener;

@Listeners({TestListener.class})
@Epic("Navigating to some urls")
@Feature("Google")
public class Google extends BaseTest {

    private NavigatorPage page = new NavigatorPage();
    private String url = SiteUrl.google;

    @Test(description = "Navigating to Google", groups = {Categories.GOOGLE, Categories.SANITY, Categories.SMOKE})
    public void test1() {
        page.navigateTo(url, driver);
        page.failTest();
    }

    @Test(description = "Navigating to Google Advertisement", groups = {Categories.GOOGLE, Categories.SANITY})
    public void test2() {
        page.navigateTo("https://ads.google.com", driver);
        page.failTest();
    }

    @Test(description = "Navigating to About page", groups = {Categories.GOOGLE, Categories.SANITY})
    public void test3() {
        page.navigateTo("https://www.google.com/intl/en_in/about/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Google Privacy", groups = {Categories.GOOGLE, Categories.SANITY})
    public void test4() {
        page.navigateTo("https://policies.google.com/privacy", driver);
        page.failTest();
    }

    @Test(description = "Navigating to Google Terms", groups = {Categories.GOOGLE, Categories.SANITY})
    public void test5() {
        page.navigateTo("https://policies.google.com/terms", driver);
        Assert.assertEquals("re", "fdfdf", "Injected assertion failure");
    }
}
