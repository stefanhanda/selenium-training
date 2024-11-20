package part3_4.com.demoqa.tests.part4.screenshots;

import com.demoqa.pages.forms.FormsPracticePage;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


public class CaptureFailedScreenshotTest extends BaseTest
{
    @Test
    public void testClickButtonWithoutJSExecutor()
    {
        //Test Input:
        String fName = "John";
        String lName = "Doe";
        String email = "john@yahoo.com";
        String phoneNoValid = "1234567890";
        String phoneNoInvalid = "123";

        FormsPracticePage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.fillFormsPageMandatoryFields(fName,lName,email,phoneNoValid);
        formsPage.clickSubmitButton();
        formsPage.clickCloseSubmitPanelButton();
    }
}
