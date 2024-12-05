package part3_4.com.demoqa.tests.part4.windows;

import com.demoqa.pages.alerts_frames_windows.WindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.GetUtility.getURL;

public class WindowsTests extends BaseTest
{
    @Test
    public void testNewWindowURL()
    {
        WindowsPage windowsPage = homePage.goToAlertsFramesWindows().clickBrowserWindowsMenuItem();
        windowsPage.clickNewWindowButton();

        windowsPage.switchToNewWindow();

        String actualUrl= getURL();
        String expectedUrl = "https://demoqa.com/sample";

        Assert.assertEquals(actualUrl,expectedUrl,
                "Actual and Expected urls do not match!");

    }
    @Test
    public void testNewTabURL()
    {
        WindowsPage windowsPage = homePage.goToAlertsFramesWindows().clickBrowserWindowsMenuItem();
        windowsPage.clickNewTabButton();

        windowsPage.switchToNewWindow();
        String actualUrl = getURL();
        String expectedUrl = "https://demoqa.com/sample";

        Assert.assertEquals(actualUrl,expectedUrl,
                "Actual and Expected urls do not match!");

    }
}
