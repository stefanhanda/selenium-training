package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.*;
import static utilities.WaitUtility.*;

public class WidgetsProgressBar extends WidgetsPage
{
    private final By startProgressBarButton = By.id("startStopButton");
    private final By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public void clickStartButton()
    {
        scrollToElementJS(startProgressBarButton);
        clickElementJS(startProgressBarButton);
    }
    public String getProgressValue(int waitTimeMs)
    {
        fluentWaitUntilVisible(waitTimeMs,progressValue);
        return getText(progressValue);
    }
}
