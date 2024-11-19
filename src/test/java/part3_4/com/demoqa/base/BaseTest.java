package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.base.BasePage;

import static com.base.BasePage._delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest
{
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL="https://demoqa.com/";
    Dimension dimension = new Dimension(1280,720);

    @BeforeClass
    public void Precondition()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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
    @AfterClass
    public void Postcondition()
    {
        driver.quit();
    }
}
