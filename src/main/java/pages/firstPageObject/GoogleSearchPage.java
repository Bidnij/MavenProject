package pages.firstPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.utils.Waiters;

import java.util.concurrent.TimeUnit;

public class GoogleSearchPage {

    public static final String GOOGLE_LINK = "https://google.com.ua/";

    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(GOOGLE_LINK);
        Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);

    }

    public GoogleResultPage search(String text) {
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("automationpractice");
        searchField.submit();
        return new GoogleResultPage(driver);
    }


}
