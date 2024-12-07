package part3_4.com.demoqa.tests.part5;

import com.demoqa.pages.elements.ElementsUploadDownloadPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage._delay;

public class FileDownloadTests extends BaseTest
{
    @Test
    public void testFileDownload()
    {
        String downloadFile = "/sampleFile.jpeg";

        ElementsUploadDownloadPage downloadPage = homePage.goToElements().clickUploadDownloadMenuItem();

        downloadPage.clearDownloadDirectory(downloadDir);

        downloadPage.clickDownloadButton();

        // Wait for the file to download
         _delay(1000);

        // Verify the downloaded file
        Assert.assertTrue(downloadPage.verifyDownload(downloadDir,downloadFile),
                "Downloaded File does not exist!");
    }

}