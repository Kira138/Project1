package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {

	  // Implicit wait for elements in the DOM
    public void waitForElementInDOM(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    // Waits for a partial URL to load
    public void waitForPage(WebDriver driver, String partialPageURL) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains(partialPageURL));
    }

    // Waits for visibility of a specified element
    public void waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
