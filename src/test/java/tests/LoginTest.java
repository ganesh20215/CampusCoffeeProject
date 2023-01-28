package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test
    public void verifyLoginWithValidCredential() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertised();
        homePage.closedSecondAdvertised();
        homePage.loginClick();
        loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccountPage(), "MY ACCOUNT", "MY ACCOUNT text should be match");
        System.out.println("Hello This is an example of git");

    }

    @Test
    public void verifyGetWindowHandle() {

    }


    @Test
    public void verifySearch() throws InterruptedException {
        homePage.searchElement("fasion");
        Thread.sleep(5000);
    }

    @Test
    public void verifyAlert() {

    }

    @Test
    public void verifyFrame() {

    }

    @Test
    public void verifyCookies() {

    }

    @AfterMethod
    public void afterMethod() {
        //    driver.close();
    }
}
