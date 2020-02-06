package firstSuites;

import com.sun.deploy.util.Waiter;
import firstSuites.pages.utils.Browser;
import firstSuites.pages.utils.BrowserFactory;
import firstSuites.pages.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static WebDriver driver;

    @BeforeSuite
    public static void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
        System.setProperty("webdriver.safari.driver", "src/test/resources/drivers/safaridriver");

       driver = BrowserFactory.getDriver("CHROME");
        //driver = new ChromeDriver(); // Тут поменять на Веб драйвер фектори сюда передать driverfactory get
        driver.manage().window().maximize();
        Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
    }

    @AfterSuite
    public static void tearDown() {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
