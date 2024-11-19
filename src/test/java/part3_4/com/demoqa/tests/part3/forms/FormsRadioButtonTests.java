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
        formsPage.ClickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.IsFemaleRadioButtonClicked();

        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button is not selected\n");
    }
    @Test
    public void TestMaleRadioButton()
    {
        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.ClickMaleRadioButton();
        Assert.assertTrue(formsPage.IsMaleRadioButtonClicked(),"\n Male Radio Button is not selected \n");
    }
    @Test
    public void TestOtherRadioButton()
    {
        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.ClickOtherButton();
        Assert.assertTrue(formsPage.IsOtherRadioButtonClicked(),"\n Other Radio Button is not selected \n");
    }
    @Test
    public void TestRadioButtonsInteraction()
    {
        boolean ActualResult = true;
        boolean ExpectedResult = true;

        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();

        // Male RB clicked => Female & Other not clicked
        formsPage.ClickMaleRadioButton();
        if(formsPage.IsMaleRadioButtonClicked() == (formsPage.IsFemaleRadioButtonClicked() | formsPage.IsOtherRadioButtonClicked()))
        {
            ActualResult = false;
        }
        // Female RB clicked => Male & Other RB not clicked
        formsPage.ClickFemaleRadioButton();
        if(formsPage.IsFemaleRadioButtonClicked() == (formsPage.IsMaleRadioButtonClicked() | formsPage.IsOtherRadioButtonClicked()))
        {
            ActualResult = false;
        }
        // Other RB clicked => Male & Female RB not clicked
        formsPage.ClickOtherButton();
        if(formsPage.IsOtherRadioButtonClicked() == (formsPage.IsMaleRadioButtonClicked() | formsPage.IsFemaleRadioButtonClicked()))
        {
            ActualResult = false;
        }

        Assert.assertEquals(ActualResult,ExpectedResult,"The Interaction Between Radio Buttons Failed!");
    }

}
