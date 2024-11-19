package Tutorial_Part_2_saucedemo.com.base;

//import jdk.jpackage.internal.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.base.BasePage;
import saucedemo.com.pages.LoginPage;

public class BaseTest
{
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void Precondition()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        basePage = new BasePage();
        basePage.setDriver(driver);

        loginPage = new LoginPage();
    }
    @AfterClass
    public void Postcondition() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
