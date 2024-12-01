package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage
{
    private final By radioButtonElement = By.xpath("//li[@id='item-2']//span[text()='Radio Button']");
    private final By webTablesElement = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private final By linksElement = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private final By dynamicElement = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");

    public ElementsDynamicProperties clickDynamicPropertiesElement()
    {
        scrollToElementJS(dynamicElement);
        clickElementJS(dynamicElement);

        return new ElementsDynamicProperties();
    }
    public ElementsRadioButtonPage clickRadioButtonElement()
    {
        scrollToElementJS(radioButtonElement);
        clickElementJS(radioButtonElement);

        return new ElementsRadioButtonPage();
    }
    public ElementsWebTablesPage clickWebTablesElement()
    {
        scrollToElementJS(webTablesElement);
        clickElementJS(webTablesElement);

        return new ElementsWebTablesPage();
    }
    public ElementsLinksPage clickLinksElement()
    {
        scrollToElementJS(linksElement);
        clickElementJS(linksElement);

        return new ElementsLinksPage();
    }
}
