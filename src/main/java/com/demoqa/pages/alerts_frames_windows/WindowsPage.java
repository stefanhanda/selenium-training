package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.GetUtility.*;
import static utilities.JavaScriptUtility.*;
import static utilities.SwitchToUtility.switchToWindow;

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
        //Get the current "Main" Window Handle
        String currentHandle = getWindowHandle();
        System.out.println("Main window id: " +currentHandle +"\n");

        //Get all the Window Handles
        Set<String> allHandles = getWindowHandles();
        System.out.println("No. of open windows: " + allHandles.size());

        for(String handle : allHandles)
        {
            if(currentHandle.equals(handle))
            {
                System.out.println("1st Window ID: " + handle);
            }
            else
            {
                //Switch to the New Window using Window Handle
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }
    }
}
