package firstSuites;

import firstSuites.pages.utils.BrowserFactory;
import firstSuites.pages.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static WebDriver driver;



    @BeforeSuite
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
        System.setProperty("webdriver.safari.driver", "src/test/resources/drivers/safaridriver");

        driver = BrowserFactory.getDriver(BrowserFactory.CHROME);
        //driver = new ChromeDriver(); // Тут поменять на Веб драйвер фектори сюда передать driverfactory get
        driver.manage().window().maximize();
        Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
    }

    //работа с Suite
    @AfterSuite
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
