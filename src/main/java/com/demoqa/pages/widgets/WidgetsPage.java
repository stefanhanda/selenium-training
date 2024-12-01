package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage
{
    private final By selectMenu = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private final By datePicker = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private final By progressBar = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");

    public WidgetsProgressBar clickProgressBar()
    {
        scrollToElementJS(progressBar);
        clickElementJS(progressBar);

        return new WidgetsProgressBar();
    }
    public WidgetsSelectMenuPage clickSelectMenu()
    {
        scrollToElementJS(selectMenu);
        clickElementJS(selectMenu);

        return new WidgetsSelectMenuPage();
    }
    public WidgetDatePickerPage clickDatePicker()
    {
        scrollToElementJS(datePicker);
        clickElementJS(datePicker);

        return new WidgetDatePickerPage();
    }
}
