package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DownloadUtility extends Utility
{
    public static boolean verifyDownloadedFile(String downloadDir, String fileName)
    {
        File downloadedFile = new File(downloadDir + fileName);
        System.out.println(downloadDir+fileName);
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
    public static void clearDirectory(String directoryPath)
    {
        File downloadDir = new File(directoryPath);

        if (downloadDir.exists() && downloadDir.isDirectory()) {
            // List all files in the directory
            File[] files = downloadDir.listFiles();

            if (files != null) {
                for (File file : files) {
                    try {
                        Files.delete(file.toPath());
                        System.out.println("Deleted file: " + file.getAbsolutePath());
                    } catch (IOException e) {
                        System.err.println("Failed to delete file: " + file.getAbsolutePath());
                        e.printStackTrace();
                    }
                }
            }
        } else {
            // If the directory doesn't exist, create it
            if (downloadDir.mkdir()) {
                System.out.println("Created download directory: " + directoryPath);
            } else {
                System.err.println("Failed to create download directory: " + directoryPath);
            }
        }
    }
}
