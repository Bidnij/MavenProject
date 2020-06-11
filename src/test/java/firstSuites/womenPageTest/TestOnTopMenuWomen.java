package firstSuites.womenPageTest;
import firstSuites.BaseTest;
import firstSuites.pages.BasePage;
import firstSuites.pages.indexPage.TopMenu;
import firstSuites.pages.utils.Links;
import firstSuites.pages.womenPage.TopMenuWomen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnTopMenuWomen  extends BaseTest {
    @Test
    public void CheckSelectAreaTopMenuWomanPage () {
        getDriver().get(Links.BASIC_URL + Links.URL_CATEGORY_WOMEN_PAGE);
        BasePage basePage = new BasePage(getDriver());
        basePage.openPage(Links.URL_CATEGORY_WOMEN_PAGE);
        TopMenu topMenu = new TopMenu(getDriver());
        topMenu.menuWomenClick();
        TopMenuWomen topMenuWomen = new TopMenuWomen(getDriver());
        String isDisebled = topMenuWomen.getCheckStyleTopMenuWomen();
        Assert.assertEquals(isDisebled, null);
    }
}
