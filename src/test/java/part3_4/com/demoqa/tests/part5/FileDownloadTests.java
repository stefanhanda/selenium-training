package part3_4.com.demoqa.tests.part5;

import com.demoqa.pages.elements.ElementsUploadDownloadPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FileDownloadTests extends BaseTest
{
    @Test
    public void testDownloadFile()
    {
        ElementsUploadDownloadPage downloadPage = homePage.goToElements().clickUploadDownloadMenuItem();

        String downloadFileName = "sampleFile.jpeg";
        String downloadDirectory = "C:\\Users\\Stefan\\Downloads";

       // downloadPage.prepareForDownload(downloadDirectory);
       // downloadPage.clickDownloadButton();

        Assert.assertTrue(downloadPage.verifyDownload(downloadDirectory,downloadFileName),
                "Download was not performed successfully!");
    }
}
