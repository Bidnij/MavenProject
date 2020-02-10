package firstSuites.firstTest;//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import firstSuites.BaseTest;
import firstSuites.pages.utils.Links;
import firstSuites.pages.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import firstSuites.pages.firstPageObject.GoogleResultPage;
import firstSuites.pages.firstPageObject.GoogleSearchPage;
import sun.awt.image.ImageWatched;


public class MyFirstSeleniumTest  extends BaseTest {
    //private WebDriver driver;




    @Test(priority = 1)  // тест без разнесенной логики
    public void myFirstTest() {


        getDriver().get(Links.GOOGLE_LINK);

        WebElement searchField = getDriver().findElement(By.name("q"));
        searchField.sendKeys("automationpractice");
        searchField.submit();

        WebElement autoSuite = getDriver().findElement(By.className("LC20lb"));
        autoSuite.click();


        Assert.assertEquals(Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE , getDriver().getCurrentUrl());
    }

    @Test(priority = 1)
    public void testSearchAndOpenPage() {
        getDriver().get(Links.GOOGLE_LINK);

        GoogleSearchPage searchPage = new GoogleSearchPage(getDriver());
        searchPage.open();
        searchPage.search();

        GoogleResultPage resultPage = new GoogleResultPage(getDriver());
        resultPage.openUrlByName();

        Assert.assertEquals(Links.BASIC_URL + Links.URL_AUTOPRACTICE_INDEX_PAGE , getDriver().getCurrentUrl());
    }






}
