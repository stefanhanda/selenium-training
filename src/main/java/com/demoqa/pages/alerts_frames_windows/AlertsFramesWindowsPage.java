package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class AlertsFramesWindowsPage extends HomePage
{
    private final By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private final By alertMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private final By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    private final By windowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");

    public ModalDialogsPage clickModalDialogsMenuItem()
    {
        scrollToElementJS(modalDialogsMenuItem);
        clickElementJS(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
    public AlertsPage clickAlertsMenuItem()
    {
        scrollToElementJS(alertMenuItem);
        clickElementJS(alertMenuItem);
        return new AlertsPage();
    }
    public FramesPage clickFramesMenuItem()
    {
        scrollToElementJS(framesMenuItem);
        clickElementJS(framesMenuItem);
        return new FramesPage();
    }
    public WindowsPage clickBrowserWindowsMenuItem()
    {
        scrollToElementJS(windowsMenuItem);
        clickElementJS(windowsMenuItem);
        return new WindowsPage();
    }
}
