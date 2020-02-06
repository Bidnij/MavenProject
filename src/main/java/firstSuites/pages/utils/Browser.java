package firstSuites.pages.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public enum Browser {
        CHROME {
            public WebDriver create(){
                return new ChromeDriver();
            }
        },
        IE {
            public WebDriver create(){
                return new SafariDriver();
            }
        },
        FIREFOX {
            public WebDriver create() {
                return new FirefoxDriver();
            }
        };

        public WebDriver create(){
            return null;
        }
}
