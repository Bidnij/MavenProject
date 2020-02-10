package firstSuites.pages.womenPage;

import firstSuites.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuWomen extends BasePage {

    protected WebDriver driver;

    public TopMenuWomen(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    WebElement menuWomen;

    public String getCheckStyleTopMenuWomen () {
       return menuWomen.getAttribute("display");
    }

}
