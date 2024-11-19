package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsRadioButtonPage extends ElementsPage
{
    private By yesRadioButton = By.id("yesRadio");
    private By impressiveRadioButton = By.id("impressiveRadio");
    private By noRadioButton = By.id("noRadio");
    private By impressiveRadioButtonSelectedText = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p/span");

    // Click Radio Button Methods:
    public void clickYesRadioButton()
    {
        scrollToElementJS(yesRadioButton);
        clickElementJS(yesRadioButton);
    }
    public void clickImpressiveRadioButton()
    {
        scrollToElementJS(impressiveRadioButton);
        clickElementJS(impressiveRadioButton);
    }
    public void clickNoRadioButton()
    {
        scrollToElementJS(noRadioButton);
        clickElementJS(noRadioButton);
    }
    // Check if Radio Button is clicked:
    public boolean isYesRadioButtonClicked()
    {
        return find(yesRadioButton).isSelected();
    }
    public boolean isImpressiveRadioButtonClicked()
    {
        scrollToElementJS(impressiveRadioButtonSelectedText);
        return find(impressiveRadioButtonSelectedText).isDisplayed();
    }
    public boolean isNoRadioButtonClicked()
    {
        return find(noRadioButton).isSelected();
    }
}
