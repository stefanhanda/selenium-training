package part3_4.com.demoqa.tests.part4.dynamic_wait;

import com.demoqa.pages.elements.ElementsDynamicProperties;
import com.demoqa.pages.widgets.WidgetsProgressBar;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTests extends BaseTest
{
    @Test
    public void testVisibleAfterButtonText()
    {
        ElementsDynamicProperties dynamicPage = homePage.goToElements().clickDynamicPropertiesElement();
        String actualText = dynamicPage.getVisibleAfterButtonText(5000);
        String expectedText = "Visible After 5 Seconds";

        Assert.assertEquals(actualText,expectedText,
                "Actual and Expected Text does not match!");
    }
    @Test
    public void testProgressBar()
    {
        WidgetsProgressBar progressBar = homePage.goToWidgets().clickProgressBar();
        progressBar.clickStartButton();
        String actualValue = progressBar.getProgressValue(30000);
        String expectedValue = "100%";

        Assert.assertEquals(actualValue,expectedValue,
                "Value is not 100%!");

    }
}
