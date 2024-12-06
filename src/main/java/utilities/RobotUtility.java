package utilities;

import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static utilities.WaitUtility.setImplicitWait;

public class RobotUtility extends Utility
{
    private static Robot robot() throws AWTException
    {
        return new Robot();
    }
    public static void robotFileUpload(String filePath) throws AWTException, InterruptedException {

        //Copy the filePath to the clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        //setImplicitWait(driver,1);
        Thread.sleep(1000);
        //Paste the filePath
        robot().keyPress(KeyEvent.VK_CONTROL);
        robot().keyPress(KeyEvent.VK_V);
        robot().keyRelease(KeyEvent.VK_V);
        robot().keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing Enter to confirm the file selection
        robot().keyPress(KeyEvent.VK_ENTER);
        robot().keyRelease(KeyEvent.VK_ENTER);

        //setImplicitWait(driver,1);
        Thread.sleep(1000);
    }
}
