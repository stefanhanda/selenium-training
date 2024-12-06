package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.*;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class ElementsTextBoxPage extends ElementsPage {
    private final By inputFullName = By.id("userName");
    private final By inputCurrentAddress = By.xpath("//textarea[@id='currentAddress']");
    private final By inputPermanentAddress = By.xpath("//textarea[@id='permanentAddress']");

    private final By outputFullName = By.id("name");
    private final By outputEmail = By.id("email");
    private final By outputCurrentAddress = By.xpath("//div[@id='output']//p[@id='currentAddress']");
    private final By outputPermanentAddress = By.xpath("//div[@id='output']//p[@id='permanentAddress']");

    private final By submitButton = By.id("submit");

    public void clickSubmitButton()
    {
        scrollToElementJS(submitButton);
        clickElementJS(submitButton);
    }
    public void setFullName(String inputText)
    {
        scrollToElementJS(inputFullName);
        sendKeys(find(inputFullName), Keys.chord(inputText));
    }
    public void setEmail(String inputText)
    {
        setFullName(Keys.chord(Keys.TAB,inputText));
    }
    public void setCurrentAddress(String inputText)
    {
        find(inputCurrentAddress).sendKeys(inputText + Keys.ENTER);
    }
    public void setPermanentAddress(String inputText)
    {
        find(inputPermanentAddress).sendKeys(inputText + Keys.ENTER);
    }

    public String getFullName()
    {
        explicitWaitUntilVisible(5,outputFullName);
        return getText(outputFullName);
    }
    public String getEmail()
    {
        explicitWaitUntilVisible(5,outputEmail);
        return getText(outputEmail);
    }
    public String getCurrentAddress()
    {
        explicitWaitUntilVisible(5,outputCurrentAddress);
        return getText(outputCurrentAddress);
    }
    public String getPermanentAddress()
    {
        explicitWaitUntilVisible(5,outputPermanentAddress);
        return getText(outputPermanentAddress);
    }
}
