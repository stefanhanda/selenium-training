package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;

public class WidgetsSliderPage extends WidgetsPage
{
    private final By sliderValueField = By.id("sliderValue");
    private final By sliderElement = By.xpath("//div[@id='sliderContainer']//input[@type='range']");

    public void moveSlider(int xOffset, int yOffset)
    {
        dragAndDropBy(find(sliderElement),xOffset,yOffset);
    }
    public String getSliderValue()
    {
        return getAttribute(sliderValueField, "value");
    }

}
