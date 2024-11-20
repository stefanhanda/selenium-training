package part3_4.com.demoqa.tests.part3.forms;

import com.demoqa.pages.forms.FormsPracticePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FormsRadioButtonTests extends BaseTest
{
    @Test
    public void TestFemaleRadioButton()
    {
        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButtonClicked();

        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button is not selected\n");
    }
    @Test
    public void TestMaleRadioButton()
    {
        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickMaleRadioButton();
        Assert.assertTrue(formsPage.isMaleRadioButtonClicked(),"\n Male Radio Button is not selected \n");
    }
    @Test
    public void TestOtherRadioButton()
    {
        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickOtherButton();
        Assert.assertTrue(formsPage.isOtherRadioButtonClicked(),"\n Other Radio Button is not selected \n");
    }
    @Test
    public void TestRadioButtonsInteraction()
    {
        boolean ActualResult = true;
        boolean ExpectedResult = true;

        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();

        // Male RB clicked => Female & Other not clicked
        formsPage.clickMaleRadioButton();
        if(formsPage.isMaleRadioButtonClicked() == (formsPage.isFemaleRadioButtonClicked() | formsPage.isOtherRadioButtonClicked()))
        {
            ActualResult = false;
        }
        // Female RB clicked => Male & Other RB not clicked
        formsPage.clickFemaleRadioButton();
        if(formsPage.isFemaleRadioButtonClicked() == (formsPage.isMaleRadioButtonClicked() | formsPage.isOtherRadioButtonClicked()))
        {
            ActualResult = false;
        }
        // Other RB clicked => Male & Female RB not clicked
        formsPage.clickOtherButton();
        if(formsPage.isOtherRadioButtonClicked() == (formsPage.isMaleRadioButtonClicked() | formsPage.isFemaleRadioButtonClicked()))
        {
            ActualResult = false;
        }

        Assert.assertEquals(ActualResult,ExpectedResult,"The Interaction Between Radio Buttons Failed!");
    }

}
