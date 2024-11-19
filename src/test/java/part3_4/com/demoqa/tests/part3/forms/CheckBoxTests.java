package part3_4.com.demoqa.tests.part3.forms;

import com.demoqa.pages.forms.FormsPracticePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTests extends BaseTest
{
    @Test
    public void TestSportsCheckBox()
    {
        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();

        formsPage.ClickSportsCheckBox();
        formsPage.ClickReadingCheckBox();
        formsPage.ClickMusicCheckBox();
        formsPage.UnClickReadingCheckBox();

        Assert.assertFalse(formsPage.IsReadingSelected(),"\nError: Reading CheckBox is Selected!\n");
    }
}
