package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class Utility extends WebTestBase {

    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void getWindowsHandles(WebDriver driver){
        driver.getWindowHandle();
    }

    public static void refreshElement(WebDriver driver){
        driver.navigate().refresh();
    }

}
