package firstSuites.indexPage;

import firstSuites.BaseTest;
import firstSuites.pages.firstPageObject.BasePage;
import firstSuites.pages.indexPage.LogoElement;
import firstSuites.pages.utils.Links;
import firstSuites.pages.utils.Pictures;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestsOnLogo extends BaseTest {

    @Test
    public void CheckStartPage (){ //Проверка что корневой страницей сайта является Страница индеса
        getDriver().get(Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);

        BasePage basePage = new BasePage(getDriver());
        basePage.openPage("");
        Assert.assertEquals(getDriver().getCurrentUrl(), Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);
    }

    @Test
    public void CheckLinkLogo () {//Проверка что корневой страницей сайта является Страница индеса
            getDriver().get(Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);

            BasePage basePage = new BasePage(getDriver());
            basePage.openPage(Links.URL_ORDER_PAGE);
            LogoElement logoElement = new LogoElement(getDriver());
            logoElement.logoClick();
            Assert.assertEquals(getDriver().getCurrentUrl(), Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);
    }

    @Test
    public void CheckSizeLogo () { //Проверка размера картинки
        BasePage basePage = new BasePage(getDriver());
        basePage.openPage(Links.URL_AUTOPRACTICE_INDEX_PAGE);
        LogoElement logoElement = new LogoElement(getDriver());
        Assert.assertEquals(logoElement.getLogo().getSize(), Pictures.LOGO_PICTURE);
    }
}
