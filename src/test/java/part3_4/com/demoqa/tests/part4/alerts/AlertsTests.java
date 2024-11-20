package part3_4.com.demoqa.tests.part4.alerts;

import com.demoqa.pages.alerts_frames_windows.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTests extends BaseTest
{
    @Test
    public void testInformationAlert()
    {
        String expectedAlertsText = "You clicked a button";

        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().clickAlertsElement();

        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertsText,"\nActual and Expected text does not match\n");

        acceptAlert();

    }
}
