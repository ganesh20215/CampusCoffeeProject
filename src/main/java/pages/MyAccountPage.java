package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;


public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement accountTitle;

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

    public String getTextOfMyAccountPage(){
       return accountTitle.getText();
    }
}
