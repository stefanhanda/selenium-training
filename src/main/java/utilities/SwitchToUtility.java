package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility
{
    private static WebDriver.TargetLocator switchTo()
    {
        return driver.switchTo();
    }
    public static String getAlertText()
    {
        return switchTo().alert().getText();
    }
    public static void acceptAlert()
    {
        switchTo().alert().accept();
    }
    public static void dismissAlert()
    {
        switchTo().alert().dismiss();
    }
    public static void setPromptAlertText(String text)
    {
        switchTo().alert().sendKeys(text);
    }
    public static void switchToFrame(String arg)
    {
        switchTo().frame(arg);
    }
    public static void switchToFrame(int arg)
    {
        switchTo().frame(arg);
    }
    public static void switchToFrame(WebElement arg)
    {
        switchTo().frame(arg);
    }
    public static void switchToParentFrame()
    {
        switchTo().parentFrame();
    }
    public static void switchToDefaultContent()
    {
        switchTo().defaultContent();
    }
    public static void switchToWindow(String handle)
    {
        switchTo().window(handle);
    }
}
