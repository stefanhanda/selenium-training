package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends AlertsFramesWindowsPage
{
    private final By alertInformationButton = By.id("alertButton");
    private final By alertTimerButton = By.id("timerAlertButton");
    private final By alertConfirmButton = By.id("confirmButton");
    private final By alertPromptButton = By.id("promtButton");

    public void clickInformationAlertButton()
    {
        scrollToElementJS(alertInformationButton);
        clickElementJS(alertInformationButton);
    }
}
