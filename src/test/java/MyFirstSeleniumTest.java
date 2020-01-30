//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.firstPageObject.GoogleResultPage;
import pages.firstPageObject.GoogleSearchPage;

import java.util.concurrent.TimeUnit;


public class MyFirstSeleniumTest {
    private WebDriver driver;
    public static final String URL_AUTOPRACTICE = "http://automationpractice.com/index.php";

    @BeforeClass
    public void startDriver() {
        driver = new ChromeDriver();

    }

    @Test(priority = 1)
    public void myFirstTest() {


        driver.get(GoogleSearchPage.GOOGLE_LINK);

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("automationpractice");
        searchField.submit();

        WebElement autoSuite = driver.findElement(By.className("LC20lb"));
        autoSuite.click();


        Assert.assertEquals(URL_AUTOPRACTICE, driver.getCurrentUrl());
    }

    @Test(priority = 1)
    public void mySecondTest() {
        driver.get(GoogleSearchPage.GOOGLE_LINK);

        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        searchPage.open();
        searchPage.search();


        GoogleResultPage resultPage = new GoogleResultPage(driver);
        resultPage.openUrlByName();
    }

    @AfterClass
    public void quitDrive() {
        driver.close();
    }


}
