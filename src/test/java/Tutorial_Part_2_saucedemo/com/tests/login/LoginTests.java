package Tutorial_Part_2_saucedemo.com.tests.login;

import Tutorial_Part_2_saucedemo.com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.com.pages.ProductsPage;

public class LoginTests extends BaseTest
{
    @Test
    public void testLoginErrorMessage()
    {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("wrong-password");

        loginPage.clickLoginButton();

        String actualMessage = loginPage.getErrorMessage();

        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
    @Test
    public void testLoginIntoProductsPage()
    {
       ProductsPage productsPage = loginPage.logIntoApplication("standard_user","secret_sauce");
       Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), " \n Products Header Is Not Displayed! \n ");
    }
}
