package pages.firstPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.utils.Waiters;


public class GoogleResultPage extends BasePage {

    public static final String URL_AUTOPRACTICE = "http://automationpractice.com/index.php";

    WebDriver driver;

    public GoogleResultPage(WebDriver driver) {
        super (driver);
    }

    public void openUrlByName(){
        WebElement clickBySearchLink = driver.findElement(By.linkText("Automation Practice"));
        clickBySearchLink.click();
        Waiters.waitForUrl(driver, Waiters.TIME_FIVE, URL_AUTOPRACTICE);
    }
}
