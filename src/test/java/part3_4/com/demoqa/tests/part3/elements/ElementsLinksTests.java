package part3_4.com.demoqa.tests.part3.elements;

import com.demoqa.pages.elements.ElementsLinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ElementsLinksTests extends BaseTest
{
    @Test
    public void testBadRequestLink()
    {
        ElementsLinksPage linksElement = homePage.goToElements().clickLinksMenuItem();
        linksElement.clickBadRequestLink();

        String actualResponse = linksElement.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\nActual response ("+actualResponse+") does not contain '400' and 'Bad Request'\n");
    }
    @Test
    public void testHomeLink()
    {
        ElementsLinksPage linksPage = homePage.goToElements().clickLinksMenuItem();

        String expectedResult = linksPage.getLinkURL();

        linksPage.clickHomeLink();
        linksPage.switchToNewTabCreated();

        String actualResult = linksPage.getCurrentURL();

        Assert.assertEquals(actualResult,expectedResult,
                "The Actual and Expected links do not match!");
    }
}
