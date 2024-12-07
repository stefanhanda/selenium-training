package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import java.awt.*;

import static utilities.DownloadUtility.verifyDownloadedFile;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.*;
import static utilities.RobotUtility.robotFileUpload;
import static utilities.DownloadUtility.*;

public class ElementsUploadDownloadPage extends ElementsPage
{
    private final By uploadFileButton = By.cssSelector("input[type='file']");
    private final By uploadTextField = By.id("uploadedFilePath");
    private final By downloadButton = By.id("downloadButton");

    public void clickUploadButton()
    {
        scrollToElementJS(uploadFileButton);
        clickElementJS(uploadFileButton);
    }
    public void uploadFileRobot(String filePath) throws AWTException, InterruptedException
    {
        robotFileUpload(filePath);
    }
    public String getUploadFilePath()
    {
        return getText(uploadTextField);
    }
    public void uploadFileSendKeys(String filePath)
    {
        find(uploadFileButton).sendKeys(filePath);
    }
    public void clickDownloadButton()
    {
        scrollToElementJS(downloadButton);
        clickElementJS(downloadButton);
        _delay(3000);
    }
    public boolean verifyDownload(String downloadDir, String fileName)
    {
        return verifyDownloadedFile(downloadDir,fileName);
    }
    public void clearDownloadDirectory(String downloadDir)
    {
        clearDirectory(downloadDir);
    }
}
