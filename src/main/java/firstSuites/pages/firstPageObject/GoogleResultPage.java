package firstSuites.pages.firstPageObject;

import firstSuites.pages.utils.Links;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import firstSuites.pages.utils.Waiters;

import java.util.concurrent.TimeUnit;


public class GoogleResultPage extends BasePage {
//    @FindBy (linkText = "Automation Practice")

    @FindBy (className = "LC20lb")
    WebElement clickBySearchLink;


    public static final String SEARCH_LINK_ELEMENT = ".//h3[text()]='Automation Practice']";

    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = SEARCH_LINK_ELEMENT)
    private WebElement searchLink;

    public void openUrlByName(){

        clickBySearchLink.click();
        Waiters.waitForUrl(driver, Waiters.TIME_FIVE, Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE);
    }
}
