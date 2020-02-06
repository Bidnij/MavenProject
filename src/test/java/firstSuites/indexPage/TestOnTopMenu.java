package firstSuites.indexPage;

import firstSuites.BaseTest;
import firstSuites.pages.firstPageObject.BasePage;
import firstSuites.pages.indexPage.TopMenu;
import firstSuites.pages.utils.Links;
import firstSuites.pages.utils.Waiters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnTopMenu extends BaseTest {

    @Test
    public void CheckCrossToWomenPage () { // Проверка что открылась нужная страница меню
        BasePage basePage = new BasePage(getDriver());
        basePage.openPage(Links.URL_AUTOPRACTICE_INDEX_PAGE);
        TopMenu topMenu = new TopMenu(getDriver());
        topMenu.menuWomenClick();
        Assert.assertEquals(getDriver().getCurrentUrl(), Links.BASIC_URL + Links.URL_CATEGORY_WOMEN_PAGE);
    }

}
