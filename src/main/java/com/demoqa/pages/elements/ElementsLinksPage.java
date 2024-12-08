package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.switchToNewWindowCreated;

public class ElementsLinksPage extends ElementsPage
{
    private final By badRequestLink = By.id("bad-request");
    private final By homeLink = By.id("simpleLink");
    private final By responseLink = By.id("linkResponse");

    public void clickBadRequestLink()
    {
        scrollToElementJS(badRequestLink);
        clickElementJS(badRequestLink);
    }
    public void clickHomeLink()
    {
        scrollToElementJS(homeLink);
        clickElementJS(homeLink);
    }
    public void switchToNewTabCreated()
    {
        switchToNewWindowCreated();
    }
    public String getResponse()
    {
        _delay(2000);
        return find(responseLink).getText();
    }
    public String getLinkURL()
    {
        return find(homeLink).getAttribute("href");
    }
    public String getCurrentURL()
    {
        return driver.getCurrentUrl();
    }
}
