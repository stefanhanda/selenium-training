package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.*;

public class ElementsDynamicProperties extends ElementsPage
{
    private final By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText(int waitTimeMs)
    {
        explicitWaitUntilVisible(waitTimeMs,visibleAfterButton);
        return getText(visibleAfterButton);
    }
}
