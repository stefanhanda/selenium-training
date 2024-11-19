package Tutorial_Part_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void Preconditions()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterClass
    public void Postconditions()
    {
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException
    {
        Thread.sleep(2000);

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void testFailLoggingIntoApplication() throws InterruptedException
    {
        Thread.sleep(2000);

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("WrongUsername");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        String actualResult = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
        String expectedResult = "Invalid credentials";

        Assert.assertEquals(actualResult,expectedResult);
    }
}
;