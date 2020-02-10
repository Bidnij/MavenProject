package firstSuites.indexPageTest;

import firstSuites.BaseTest;
import firstSuites.pages.BasePage;
import firstSuites.pages.indexPage.TopMenu;
import firstSuites.pages.utils.Links;
import firstSuites.pages.womenPage.TopMenuWomen;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnTopMenu extends BaseTest {



    @Test
    public void CheckCrossToWomenPage () { // Проверка что открылась нужная страница меню
        getDriver().get(Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);
        BasePage basePage = new BasePage(getDriver());
        basePage.openPage(Links.URL_AUTOPRACTICE_INDEX_PAGE);
        TopMenu topMenu = new TopMenu(getDriver());
        topMenu.menuWomenClick();
        Assert.assertEquals(getDriver().getCurrentUrl(), Links.BASIC_URL + Links.URL_CATEGORY_WOMEN_PAGE);
    }
    @Test
    public void CheckSelectAreaTopMenuWomanPage () {
        getDriver().get(Links.BASIC_URL + Links.URL_CATEGORY_WOMEN_PAGE);
        BasePage basePage = new BasePage(getDriver());
        basePage.openPage(Links.URL_CATEGORY_WOMEN_PAGE);
        TopMenu topMenu = new TopMenu(getDriver());
        topMenu.menuWomenClick();
        TopMenuWomen topMenuWomen =  new TopMenuWomen(getDriver());
        String isDisebled =  topMenuWomen.getCheckStyleTopMenuWomen();
        //String none = "none";
        Assert.assertEquals(isDisebled, null);
    }


}
