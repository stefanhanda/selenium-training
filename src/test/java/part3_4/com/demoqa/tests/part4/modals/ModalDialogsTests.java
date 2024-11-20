package part3_4.com.demoqa.tests.part4.modals;

import com.demoqa.pages.alerts_frames_windows.ModalDialogsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage._delay;

public class ModalDialogsTests extends BaseTest
{
    @Test
    public void TestSmallModalDialog()
    {
        ModalDialogsPage modalDialogsPage = homePage.goToAlertsFramesWindows().clickModalDialogsElement();
        modalDialogsPage.clickSmallModalButton();
        _delay(500);
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\nThe actual text does not contain <<small modal>>\n");
        modalDialogsPage.clickSmallModalCloseButton();
    }
    @Test
    public void TestLargeModalDialog()
    {
        ModalDialogsPage modalDialogsPage = homePage.goToAlertsFramesWindows().clickModalDialogsElement();
        modalDialogsPage.clickLargeModalButton();
        _delay(500);
        String actualText = modalDialogsPage.getLargeModalText();
        Assert.assertTrue(actualText.contains("Lorem Ipsum"),
                "\nThe actual text does not contain <<Lorem Ipsum>>\n");
        modalDialogsPage.clickLargeModalCloseButton();
    }
}
