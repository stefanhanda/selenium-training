package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class AlertsFramesWindowsPage extends HomePage
{
    private final By modalDialogsElement = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogsElement()
    {
        scrollToElementJS(modalDialogsElement);
        clickElementJS(modalDialogsElement);
        return new ModalDialogsPage();
    }
}
