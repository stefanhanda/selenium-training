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

        formsPage.clickSportsCheckBox();
        formsPage.clickReadingCheckBox();
        formsPage.clickMusicCheckBox();
        formsPage.unClickReadingCheckBox();

        Assert.assertFalse(formsPage.isReadingSelected(),"\nError: Reading CheckBox is Selected!\n");
    }
}
