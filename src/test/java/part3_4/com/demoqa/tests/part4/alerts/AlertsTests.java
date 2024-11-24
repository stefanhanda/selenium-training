package part3_4.com.demoqa.tests.part4.alerts;

import com.demoqa.pages.alerts_frames_windows.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;
@Test
public class AlertsTests extends BaseTest
{
    //Information Alert Tests:
    public void testInformationAlert()
    {
        String expectedAlertsText = "You clicked a button";

        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().clickAlertsElement();

        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertsText,"\nActual and Expected text does not match\n");

        acceptAlert();

    }
    //Confirm Alert Tests:
    public void testConfirmationAlertAccept()
    {
        String expectedAlertResultText = "You selected Ok";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().clickAlertsElement();

        alertsPage.clickConfirmationAlertButton();
        acceptAlert();
        String actualAlertResultText = alertsPage.getConfirmAlertResultText();

        Assert.assertEquals(actualAlertResultText, expectedAlertResultText,
                "Actual and Expected message does not match!");
    }
    public void testConfirmationAlertDismiss()
    {
        String expectedAlertResultText = "You selected Cancel";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().clickAlertsElement();

        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualAlertResultText = alertsPage.getConfirmAlertResultText();

        Assert.assertEquals(actualAlertResultText, expectedAlertResultText,
                "Actual and Expected message does not match!");
    }
    //Prompt Alert Tests:
    public void testPromptAlertAccept()
    {
        String inputText = "-!TestingXC__testing@123#=$$.!";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().clickAlertsElement();

        alertsPage.clickPromptAlertButton();
        setPromptAlertText(inputText);
        acceptAlert();
        String actualAlertResultText = alertsPage.getPromptAlertResultText();

        Assert.assertTrue(actualAlertResultText.contains(inputText),
                "The input message has not been displayed after accepting the alert!");
    }
    public void testPromptAlertDismiss()
    {
        //Testing Testing
        String inputText = "-!TestingXC__testing@123#=$$.!";
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().clickAlertsElement();

        alertsPage.clickPromptAlertButton();
        setPromptAlertText(inputText);
        dismissAlert();
        String actualAlertResultText = alertsPage.getPromptAlertResultText();

        Assert.assertFalse(actualAlertResultText.contains(inputText),
                "The input message has been displayed after dismissing the alert!");
    }
}
