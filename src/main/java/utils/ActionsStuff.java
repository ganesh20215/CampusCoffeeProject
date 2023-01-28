package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsStuff {


    public static void dragAndDrop(WebDriver driver, WebElement srcElement, WebElement desElement) {
        Actions action = new Actions(driver);
        action.dragAndDrop(srcElement, desElement)
                .perform();
    }

    public static void moveToElement(WebDriver driver, WebElement srcElement) {
        Actions action = new Actions(driver);
        action.moveToElement(srcElement)
                .perform();
    }


}
