package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[@title='Close']")
    WebElement firstAdvertiseClosed;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement secondAdvertised;

    @FindBy(id = "search-text-input")
    WebElement search;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void loginClick(){
        loginBtn.click();
    }

    public void closedFirstAdvertised(){
        Utility.waitUntilElementToBeClick(driver, firstAdvertiseClosed);
        firstAdvertiseClosed.click();
    }

    public void closedSecondAdvertised(){
        Utility.waitUntilElementToBeClick(driver, secondAdvertised);
        secondAdvertised.click();
    }

    public void searchElement(String product){
        search.sendKeys(product);
        search.sendKeys(Keys.ENTER);
        Utility.refreshElement(driver);
    }

}
