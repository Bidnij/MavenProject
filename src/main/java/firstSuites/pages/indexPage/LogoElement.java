package firstSuites.pages.indexPage;

import firstSuites.pages.firstPageObject.BasePage;
import firstSuites.pages.firstPageObject.GoogleResultPage;
import firstSuites.pages.utils.Links;
import firstSuites.pages.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class LogoElement extends BasePage {

    protected WebDriver driver;

    public LogoElement(WebDriver driver) {
        super(driver);

    }


    @FindBy(className = "logo")
     WebElement logo;



    public void logoClick () {
        logo.click();
        //Waiters.waitForUrl(driver, Waiters.TIME_HUNGRID, Links.URL_AUTOPRACTICE_INDEX_PAGE);
        //Waiters.implicitWait(driver, Waiters.TIME_HUNGRID, TimeUnit.SECONDS);
    }


    public WebElement getLogo() {
        return logo;
    }
}
