package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage
{
    private final By selectMenuMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private final By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private final By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");
    private final By sliderMenuItem = By.xpath("//li[@id='item-3']//span[text()='Slider']");

    public WidgetsProgressBarPage clickProgressBarMenuItem()
    {
        scrollToElementJS(progressBarMenuItem);
        clickElementJS(progressBarMenuItem);

        return new WidgetsProgressBarPage();
    }
    public WidgetsSelectMenuPage clickSelectMenuMenuItem()
    {
        scrollToElementJS(selectMenuMenuItem);
        clickElementJS(selectMenuMenuItem);

        return new WidgetsSelectMenuPage();
    }
    public WidgetDatePickerPage clickDatePickerMenuItem()
    {
        scrollToElementJS(datePickerMenuItem);
        clickElementJS(datePickerMenuItem);

        return new WidgetDatePickerPage();
    }
    public WidgetsSliderPage clickSliderMenuItem()
    {
        scrollToElementJS(sliderMenuItem);
        clickElementJS(sliderMenuItem);

        return new WidgetsSliderPage();
    }
}
