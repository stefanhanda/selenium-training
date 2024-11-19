package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;
import static utilities.DropDownUtility.*;

public class WidgetDatePickerPage extends WidgetsPage
{
    private final By selectDateField = By.id("datePickerMonthYearInput");
    private final By monthDropDown = By.cssSelector(".react-datepicker__month-select");
    private final By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day)
    {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day + "']");
    }
    public void clickSelectDate()
    {
        clickElementJS(selectDateField);
    }
    public String getDate()
    {
        return find(selectDateField).getAttribute("value");
    }
    public void selectMonth(String month)
    {
        selectByVisibleText(monthDropDown, month);
    }
    public void selectYear(String year)
    {
        selectByVisibleText(yearDropDown, year);
    }
    public void clickDay(String day)
    {
        clickElementJS(dayValue(day));
    }
}
