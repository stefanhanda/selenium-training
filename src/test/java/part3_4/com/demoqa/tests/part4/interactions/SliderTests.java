package part3_4.com.demoqa.tests.part4.interactions;

import com.demoqa.pages.widgets.WidgetsSliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTests extends BaseTest
{
    @Test
    public void testSliderResult()
    {

        int xOffset = 180;
        int yOffset = 0;
        String expectedValue = "94";

        WidgetsSliderPage sliderPage = homePage.goToWidgets().clickSliderMenuItem();
        sliderPage.moveSlider(xOffset,yOffset);

        String actualValue = sliderPage.getSliderValue();

        Assert.assertEquals(actualValue, expectedValue,
                "Actual and expected values do not match!");
    }
}
