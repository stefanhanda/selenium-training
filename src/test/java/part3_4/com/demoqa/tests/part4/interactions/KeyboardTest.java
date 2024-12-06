package part3_4.com.demoqa.tests.part4.interactions;

import com.demoqa.pages.elements.ElementsTextBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest
{
    @Test
    public void testApplicationUsingKeyboard()
    {
        ElementsTextBoxPage textBoxPage = homePage.goToElements().clickTextBoxMenuItem();

        textBoxPage.setFullName("Stefan-Catalin HANDA");

        textBoxPage.setEmail("stefan.handa@selenium.com");

        textBoxPage.setCurrentAddress("4815 Selenium Street");
        textBoxPage.setCurrentAddress("No.16, Building No.23, Apartment 42");
        textBoxPage.setCurrentAddress("Timisoara, Timis, Romania");

        textBoxPage.setPermanentAddress("Same as Current Address");

        textBoxPage.clickSubmitButton();

        String actualFullNameText = textBoxPage.getFullName();
        String actualEmailText = textBoxPage.getEmail();
        String actualCurrentAddressText = textBoxPage.getCurrentAddress();
        String actualPermanentAddressText = textBoxPage.getPermanentAddress();

        Assert.assertTrue(actualFullNameText.contains("Stefan-Catalin HANDA"),
                "Actual Full Name is Wrong!");
        Assert.assertTrue(actualEmailText.contains("stefan.handa@selenium.com"),
                "Actual Email is Wrong!");
        Assert.assertTrue(actualCurrentAddressText.contains("4815 Selenium Street") &&
                        actualCurrentAddressText.contains("No.16, Building No.23, Apartment 42") &&
                        actualCurrentAddressText.contains("Timisoara, Timis, Romania"),
                "Actual Current Address is Wrong!");
        Assert.assertTrue(actualPermanentAddressText.contains("Same as Current Address"),
                "Actual Permanent Address is Wrong!");
    }
}
