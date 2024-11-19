package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class WidgetsSelectMenuPage extends WidgetsPage
{
    private final By standardMultiSelect = By.id("cars");
    private final By oldSelectMenu = By.id("oldSelectMenu");

    public void selectOldSelectMenu(String text)
    {
        scrollToElementJS(oldSelectMenu);
        selectByValue(oldSelectMenu, text);
    }
    public void selectStandardMulti(String text)
    {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect,text);
    }
    public void selectStandardMulti(int index)
    {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }
    public void deselectStandardMulti(String value)
    {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }
    public List<String> getAllSelectedStandardMultiOptions()
    {
        return getAllSelectedOptions(standardMultiSelect);
    }
    public String getSelectedOption()
    {
        return find(oldSelectMenu).getText();
    }
}
