package part3_4.com.demoqa.tests.part3.elements;

import com.demoqa.pages.elements.ElementsRadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ElementsRadioButtonTests extends BaseTest
{
    @Test
    public void TestYesRadioButton()
    {
        ElementsRadioButtonPage elementsRadioButtonPage = homePage.goToElements().clickRadioButtonElement();
        elementsRadioButtonPage.clickYesRadioButton();

        boolean isClicked = elementsRadioButtonPage.isYesRadioButtonClicked();
        Assert.assertTrue(isClicked,"<<Yes>> Radio Button was not clicked!");
    }
    @Test
    public void TestImpressiveRadioButton()
    {
        ElementsRadioButtonPage elementsRadioButtonPage = homePage.goToElements().clickRadioButtonElement();
        elementsRadioButtonPage.clickImpressiveRadioButton();

        boolean isClicked = elementsRadioButtonPage.isImpressiveRadioButtonClicked();
        Assert.assertTrue(isClicked,"<<Impressive>> Radio Button was not clicked!");
    }
    @Test
    public void TestNoRadioButton()
    {
        ElementsRadioButtonPage elementsRadioButtonPage = homePage.goToElements().clickRadioButtonElement();
        elementsRadioButtonPage.clickNoRadioButton();

        boolean isClicked = elementsRadioButtonPage.isNoRadioButtonClicked();
        Assert.assertFalse(isClicked, "<<No>> Radio Button was clicked!");
    }

}
