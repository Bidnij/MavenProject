package firstSuites.indexPageTest;

import firstSuites.BaseTest;
import firstSuites.pages.BasePage;
import firstSuites.pages.indexPage.LogoElement;
import firstSuites.pages.utils.Links;
import firstSuites.pages.utils.Pictures;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsOnLogo extends BaseTest {

    String url = Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE;

    @Test
    @Description("test")
    @Owner("Myhail")
    public void CheckStartPage (){ //Проверка что корневой страницей сайта является Страница индеса
        getDriver().get(url);

        BasePage basePage = new BasePage(getDriver());
        basePage.openPage("");
        Assert.assertEquals(getDriver().getCurrentUrl(), url);
    }

    @Test
    @Description("test")
    @Owner("Myhail")
    public void CheckLinkLogo () {//Проверка что корневой страницей сайта является Страница индеса
            getDriver().get(url);

            BasePage basePage = new BasePage(getDriver());
            basePage.openPage(Links.URL_ORDER_PAGE);
            LogoElement logoElement = new LogoElement(getDriver());
            logoElement.logoClick();
            Assert.assertEquals(getDriver().getCurrentUrl(), url);
    }

    @Test
    @Description("test")
    @Owner("Myhail")
    public void CheckSizeLogo () { //Проверка размера картинки
        getDriver().get(Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);
        BasePage basePage = new BasePage(getDriver());
        basePage.openPage(Links.URL_AUTOPRACTICE_INDEX_PAGE);
        LogoElement logoElement = new LogoElement(getDriver());
        Assert.assertEquals(logoElement.getLogo().getSize(), Pictures.LOGO_PICTURE);
    }
}
