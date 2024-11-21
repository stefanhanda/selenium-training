package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends AlertsFramesWindowsPage
{
    private final By alertInformationButton = By.id("alertButton");
    private final By alertTimerButton = By.id("timerAlertButton");
    private final By alertConfirmButton = By.id("confirmButton");
    private final By alertPromptButton = By.id("promtButton");

    private final By confirmAlertResultText = By.id("confirmResult");
    private final By promptAlertResultText = By.id("promptResult");

    //Information Alert Methods:
    public void clickInformationAlertButton()
    {
        scrollToElementJS(alertInformationButton);
        clickElementJS(alertInformationButton);
    }
    //Confirmation Alert Methods:
    public void clickConfirmationAlertButton()
    {
        scrollToElementJS(alertConfirmButton);
        clickElementJS(alertConfirmButton);
    }
    public String getConfirmAlertResultText()
    {
        return find(confirmAlertResultText).getText();
    }
    //Prompt Alert Methods:
    public void clickPromptAlertButton()
    {
        scrollToElementJS(alertPromptButton);
        clickElementJS(alertPromptButton);
    }
    public String getPromptAlertResultText()
    {
        List<WebElement> elements = driver.findElements(promptAlertResultText); // Check if the element exists
        if (!elements.isEmpty()) {
            return elements.get(0).getText(); // Return the text if the element exists
        } else {
            return ""; // Or handle the scenario when the element is not found
        }
    }
}
