package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {
    private final By radioButtonMenuItem = By.xpath("//li[@id='item-2']//span[text()='Radio Button']");
    private final By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private final By dynamicMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
    private final By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private final By uploadDownloadMenuItem = By.xpath("//li[@id='item-7']/span[text()='Upload and Download']");

    public ElementsDynamicProperties clickDynamicPropertiesMenuItem() {
        scrollToElementJS(dynamicMenuItem);
        clickElementJS(dynamicMenuItem);

        return new ElementsDynamicProperties();
    }

    public ElementsRadioButtonPage clickRadioButtonMenuItem() {
        scrollToElementJS(radioButtonMenuItem);
        clickElementJS(radioButtonMenuItem);

        return new ElementsRadioButtonPage();
    }

    public ElementsWebTablesPage clickWebTablesMenuItem() {
        scrollToElementJS(webTablesMenuItem);
        clickElementJS(webTablesMenuItem);

        return new ElementsWebTablesPage();
    }

    public ElementsLinksPage clickLinksMenuItem() {
        scrollToElementJS(linksMenuItem);
        clickElementJS(linksMenuItem);

        return new ElementsLinksPage();
    }

    public ElementsTextBoxPage clickTextBoxMenuItem() {
        scrollToElementJS(textBoxMenuItem);
        clickElementJS(textBoxMenuItem);

        return new ElementsTextBoxPage();
    }

    public ElementsUploadDownloadPage clickUploadDownloadMenuItem()
    {
        scrollToElementJS(uploadDownloadMenuItem);
        clickElementJS(uploadDownloadMenuItem);

        return new ElementsUploadDownloadPage();
    }
}
