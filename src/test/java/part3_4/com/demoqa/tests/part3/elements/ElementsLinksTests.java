package part3_4.com.demoqa.tests.part3.elements;

import com.demoqa.pages.elements.ElementsLinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ElementsLinksTests extends BaseTest
{
    @Test
    public void TestLinks()
    {
        ElementsLinksPage linksElement = homePage.goToElements().clickLinksElement();
        linksElement.clickBadRequestLink();

        String actualResponse = linksElement.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\nActual response ("+actualResponse+") does not contain '400' and 'Bad Request'\n");
    }
}
