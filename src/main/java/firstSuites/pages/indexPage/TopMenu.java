package firstSuites.pages.indexPage;

import firstSuites.pages.firstPageObject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenu extends BasePage {
    protected WebDriver driver;

    public TopMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    WebElement menuWomen;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    WebElement menuDress;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    WebElement menuTShirt;


    public void menuWomenClick () {
        menuWomen.click();
    }

    public void menuDressnClick () {
        menuDress.click();
    }

    public void menuTShirtClick () {
        menuDress.click();
    }
}
