package part3_4.com.demoqa.tests.part4.frames;

import com.demoqa.pages.alerts_frames_windows.FramesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTests extends BaseTest
{
    @Test
    public void testFramesLargeBox()
    {
        FramesPage framesPage = homePage.goToAlertsFramesWindows().clickFramesElement();
        String actualFrameText = framesPage.getTextInLargeFrame();

        String expectedFrameText = "This is a sample page";
        Assert.assertEquals(actualFrameText, expectedFrameText,
                "The actual and expected texts are different!");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualHeaderText,expectedHeaderText,
                "The actual and expected results are different!");
    }
    @Test
    public void testFramesSmallBox()
    {
        FramesPage framesPage = homePage.goToAlertsFramesWindows().clickFramesElement();
        String actualFrameText = framesPage.getTextInSmallFrame();

        String expectedFrameText = "This is a sample page";
        Assert.assertEquals(actualFrameText, expectedFrameText,
                "The actual and expected texts are different!");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualHeaderText,expectedHeaderText,
                "The actual and expected results are different!");
    }
}
