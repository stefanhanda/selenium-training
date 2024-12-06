package part3_4.com.demoqa.tests.part5;

import com.demoqa.pages.elements.ElementsUploadDownloadPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.awt.*;

public class FileUploadTests extends BaseTest
{
    @Test
    public void testUploadFileWithSendKeys()
    {
        String expectedPath="C:\\fakepath\\StefanCatalin-Handa-CV.pdf";
        String actualPath;
        String inputPath="C:\\Users\\Stefan\\Desktop\\StefanCatalin-Handa-CV.pdf";

        ElementsUploadDownloadPage uploadDownloadPage = homePage.goToElements().clickUploadDownloadMenuItem();

        uploadDownloadPage.uploadFileSendKeys(inputPath);

        actualPath = uploadDownloadPage.getUploadFilePath();
        Assert.assertEquals(actualPath,expectedPath,"Actual and Expected paths do not match!");
    }
    @Test
    public void testUploadFileWithRobotClass() throws InterruptedException, AWTException
    {
        String expectedPath="C:\\fakepath\\StefanCatalin-Handa-CV.pdf";
        String actualPath;
        String inputPath="C:\\Users\\Stefan\\Desktop\\StefanCatalin-Handa-CV.pdf";

        ElementsUploadDownloadPage uploadDownloadPage = homePage.goToElements().clickUploadDownloadMenuItem();

        uploadDownloadPage.clickUploadButton();
        uploadDownloadPage.uploadFileRobot(inputPath);

        actualPath = uploadDownloadPage.getUploadFilePath();
        Assert.assertEquals(actualPath,expectedPath,"Actual and Expected paths do not match!");
    }
}
