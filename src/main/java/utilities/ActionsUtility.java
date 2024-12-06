package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility
{
    private static Actions act()
    {
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int xOffset, int yOffset)
    {
        act().dragAndDropBy(source,xOffset,yOffset).perform();
    }
    public static void sendKeys(WebElement source, CharSequence inputText)
    {
        act().sendKeys(source, inputText).perform();
    }
}
