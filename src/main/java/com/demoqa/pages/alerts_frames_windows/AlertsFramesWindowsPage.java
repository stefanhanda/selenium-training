package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class AlertsFramesWindowsPage extends HomePage
{
    private final By modalDialogsElement = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private final By alertElement = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private final By framesElement = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    private final By windowsElement = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");

    public ModalDialogsPage clickModalDialogsElement()
    {
        scrollToElementJS(modalDialogsElement);
        clickElementJS(modalDialogsElement);
        return new ModalDialogsPage();
    }
    public AlertsPage clickAlertsElement()
    {
        scrollToElementJS(alertElement);
        clickElementJS(alertElement);
        return new AlertsPage();
    }
    public FramesPage clickFramesElement()
    {
        scrollToElementJS(framesElement);
        clickElementJS(framesElement);
        return new FramesPage();
    }
    public WindowsPage clickBrowserWindowsElement()
    {
        scrollToElementJS(windowsElement);
        clickElementJS(windowsElement);
        return new WindowsPage();
    }
}
