package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends AlertsFramesWindowsPage
{
    //SmallModal Fields:
    private final By smallModalId = By.id("showSmallModal");
    private final By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private final By smallModalCancelButton = By.id("closeSmallModal");
    //LargeModal Fields:
    private final By largeModalId = By.id("showLargeModal");
    private final By largeModalText = By.xpath("//div[@class='modal-body']/p[contains(text(), 'Lorem Ipsum')]");
    private final By largeModalCancelButton = By.id("closeLargeModal");

    public void clickSmallModalButton()
    {
        scrollToElementJS(smallModalId);
        clickElementJS(smallModalId);
    }
    public String getSmallModalText()
    {
        return find(smallModalText).getText();
    }
    public void clickSmallModalCloseButton()
    {
        scrollToElementJS(smallModalCancelButton);
        clickElementJS(smallModalCancelButton);
    }
    public void clickLargeModalButton()
    {
        scrollToElementJS(largeModalId);
        clickElementJS(largeModalId);
    }
    public String getLargeModalText()
    {
        return find(largeModalText).getText();
    }
    public void clickLargeModalCloseButton()
    {
        scrollToElementJS(largeModalCancelButton);
        clickElementJS(largeModalCancelButton);
    }
}
