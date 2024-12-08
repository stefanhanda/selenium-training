package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static utilities.GetUtility.getWindowHandle;
import static utilities.GetUtility.getWindowHandles;

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
    public static void switchToNewWindowCreated()
    {
        //Get the current "Main" Window Handle
        String currentHandle = getWindowHandle();
        System.out.println("Main window id: " +currentHandle +"\n");

        //Get all the Window Handles
        Set<String> allHandles = getWindowHandles();
        System.out.println("No. of open windows: " + allHandles.size());

        for(String handle : allHandles)
        {
            if(currentHandle.equals(handle))
            {
                System.out.println("1st Window ID: " + handle);
            }
            else
            {
                //Switch to the New Window using Window Handle
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }
    }
}
