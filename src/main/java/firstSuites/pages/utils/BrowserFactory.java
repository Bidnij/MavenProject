package firstSuites.pages.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class BrowserFactory {

    public static final WebDriver DEFAULT_CHROME = new ChromeDriver();

    public static WebDriver getDriver (String nameDriver) {
        WebDriver driver = null;

        switch (nameDriver) {
            case "FIREFOX": return new FirefoxDriver();
            case "CHROME": return new ChromeDriver();
            case "SAFARI": return new SafariDriver();
            default: return DEFAULT_CHROME;

        }
    }

}
