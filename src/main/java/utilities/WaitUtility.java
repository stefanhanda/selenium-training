package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility extends Utility
{
    public static void explicitWaitUntilVisible(int ms, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(ms));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void fluentWaitUntilVisible(int ms, By locator)
    {
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofMillis(ms))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
