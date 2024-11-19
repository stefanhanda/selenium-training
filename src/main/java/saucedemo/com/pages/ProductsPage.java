package saucedemo.com.pages;

import org.openqa.selenium.By;
import com.base.BasePage;

public class ProductsPage extends BasePage
{
    private By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductsHeaderDisplayed()
    {
        return find(productsHeader).isDisplayed();
    }
}
