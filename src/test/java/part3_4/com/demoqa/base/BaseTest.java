package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.base.BasePage;

import java.io.File;
import java.io.IOException;

import static com.base.BasePage._delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest
{
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String DEMOQA_URL="https://demoqa.com/";
    protected String downloadDir = "D:\\DownloadSeleniumFolder";
    Dimension dimension = new Dimension(1280,720);

    @BeforeClass
    public void Precondition()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        // Set Chrome preferences for file download
        options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
            put("download.default_directory", downloadDir);
            put("download.prompt_for_download", false);
            put("download.directory_upgrade", true);
            put("safebrowsing.enabled", true);
        }});

        driver = new ChromeDriver(options); // Initialize the driver with default settings
        driver.manage().window().setSize(dimension);
    }
    @BeforeMethod
    public void LoadApplication()
    {
        driver.get(DEMOQA_URL);

        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }
    @AfterMethod
    public void waitAfterTestCase()
    {
        _delay(2000);
    }
    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult)
    {
        if(testResult.getStatus() == ITestResult.FAILURE)
        {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source =  screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")+
                    "/resources/screenshots/("+
                    java.time.LocalDate.now() +")" +
                    testResult.getName() + ".png");
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot located at: " + destination);
        }
    }
    @AfterClass
    public void Postcondition()
    {
        driver.quit();
    }
}
