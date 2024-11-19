package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage
{
    private final By selectMenu = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");

    public WidgetsSelectMenuPage clickSelectMenu()
    {
        scrollToElementJS(selectMenu);
        clickElementJS(selectMenu);

        return new WidgetsSelectMenuPage();
    }
}
