package utilities;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DownloadUtility extends Utility
{
    public static void setUpForDownload(String downloadDir)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        // Set preferences for file download
        options.addArguments("download.default_directory=" + downloadDir);
        options.addArguments("download.prompt_for_download=false");
        options.addArguments("download.directory_upgrade=true");
        options.addArguments("safebrowsing.enabled=true");
        options.addArguments("--headless");
    }
    public static boolean verifyDownloadedFile(String downloadDir, String fileName)
    {
        File downloadedFile = new File(downloadDir + fileName);
        if (downloadedFile.exists())
        {
            System.out.println("File downloaded successfully: " + downloadedFile.getAbsolutePath());
            return true;
        }
        else
        {
            System.err.println("File not downloaded.");
            return false;
        }
    }
}
