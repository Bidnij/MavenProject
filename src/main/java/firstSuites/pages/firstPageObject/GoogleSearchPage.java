package firstSuites.pages.firstPageObject;

import firstSuites.pages.BasePage;
import firstSuites.pages.utils.Links;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import firstSuites.pages.utils.Waiters;

import java.util.concurrent.TimeUnit;

public class GoogleSearchPage extends BasePage {


    @FindBy(name = "q")
    private WebElement searchField;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);

    }

    public GoogleSearchPage open() {
        driver.get(Links.GOOGLE_LINK);
        Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
        return new GoogleSearchPage(driver);
    }

    public GoogleSearchPage search() {
        //WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("automationpractice");
        searchField.submit();
        return new GoogleSearchPage(driver);
    }


}
