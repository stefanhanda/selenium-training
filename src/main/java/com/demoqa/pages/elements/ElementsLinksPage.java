package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsLinksPage extends ElementsPage
{
    private By badRequestLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");

    public void clickBadRequestLink()
    {
        scrollToElementJS(badRequestLink);
        clickElementJS(badRequestLink);
    }
    public String getResponse()
    {
        _delay(2000);
        return find(responseLink).getText();
    }
}
