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
@Feature("TestVagrant")
public class TestVagrant extends BaseTest {

    private NavigatorPage page = new NavigatorPage();
    private String url = SiteUrl.testvagrant;

    @Test(description = "Navigating to TestVagrant about page", groups = {Categories.TESTVAGRANT, Categories.SANITY})
    public void test1() {
        page.navigateTo(url + "about/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to TestVagrant optimus page", groups = {Categories.TESTVAGRANT, Categories.SANITY})
    public void test2() {
        page.navigateTo(url + "optimus/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to TestVagrant insights page", groups = {Categories.TESTVAGRANT, Categories.SANITY})
    public void test3() {
        page.navigateTo(url + "insights/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to TestVagrant contact page", groups = {Categories.TESTVAGRANT, Categories.SANITY})
    public void test4() {
        page.navigateTo(url + "contact/", driver);
        page.failTest();
    }

    @Test(description = "Navigating to TestVagrant home page", groups = {Categories.TESTVAGRANT, Categories.SANITY, Categories.SMOKE})
    public void test5() {
        page.navigateTo(url, driver);
        page.failTest();
    }
}
