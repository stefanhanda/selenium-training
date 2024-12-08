package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;
import static utilities.SwitchToUtility.switchToNewWindowCreated;

public class WindowsPage extends AlertsFramesWindowsPage
{
    private final By buttonNewTab = By.id("tabButton");
    private final By buttonNewWindow = By.id("windowButton");
    private final By buttonNewWindowMessage = By.id("messageWindowButton");

    public void clickNewWindowButton()
    {
        scrollToElementJS(buttonNewWindow);
        clickElementJS(buttonNewWindow);
    }
    public void clickNewTabButton()
    {
        scrollToElementJS(buttonNewTab);
        clickElementJS(buttonNewTab);
    }
    public void switchToNewWindow()
    {
        switchToNewWindowCreated();
    }
}
