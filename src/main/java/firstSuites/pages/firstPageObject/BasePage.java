package firstSuites.pages.firstPageObject;

import firstSuites.pages.indexPage.LogoElement;
import firstSuites.pages.utils.Links;
import firstSuites.pages.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage { // клас отвечаюзий за драйвер
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage openPage(String pageUrl) {
        driver.get(Links.BASIC_URL + pageUrl);
        Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
        return new BasePage(driver);
    }
}
