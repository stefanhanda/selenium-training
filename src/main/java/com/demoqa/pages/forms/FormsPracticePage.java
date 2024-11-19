package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPracticePage extends FormsPage
{
    // Forms Page RadioButtons:
    private By maleRadioButton =    By.id("gender-radio-1");
    private By femaleRadioButton =  By.id("gender-radio-2");
    private By otherRadioButton =   By.id("gender-radio-3");

    // Forms Page Checkboxes:
    private By sportsCheckBox =     By.id("hobbies-checkbox-1");
    private By readingCheckBox =    By.id("hobbies-checkbox-2");
    private By musicCheckBox =      By.id("hobbies-checkbox-3");

    // Radio Button Click Methods:
    public void ClickMaleRadioButton()
    {
        scrollToElementJS(maleRadioButton);
        clickElementJS(maleRadioButton);
    }
    public void ClickFemaleRadioButton()
    {
        scrollToElementJS(femaleRadioButton);
        clickElementJS(femaleRadioButton);
    }
    public void ClickOtherButton()
    {
        scrollToElementJS(otherRadioButton);
        clickElementJS(otherRadioButton);
    }

    // Radio Button Click Checks:
    public boolean IsMaleRadioButtonClicked()
    {
        return find(maleRadioButton).isSelected();
    }
    public boolean IsFemaleRadioButtonClicked()
    {
        return find(femaleRadioButton).isSelected();
    }
    public boolean IsOtherRadioButtonClicked()
    {
        return find(otherRadioButton).isSelected();
    }

    // CheckBox Click Methods:
    public void ClickSportsCheckBox()
    {
        if(!find(sportsCheckBox).isSelected())
        {
            scrollToElementJS(sportsCheckBox);
            clickElementJS(sportsCheckBox);
        }
    }
    public void ClickReadingCheckBox()
    {
        if(!find(readingCheckBox).isSelected())
        {
            scrollToElementJS(readingCheckBox);
            clickElementJS(readingCheckBox);
        }
    }
    public void ClickMusicCheckBox()
    {
        if(!find(musicCheckBox).isSelected())
        {
            scrollToElementJS(musicCheckBox);
            clickElementJS(musicCheckBox);
        }
    }
    // CheckBox UN-Click Methods:
    public void UnClickSportsCheckBox()
    {
        if(find(sportsCheckBox).isSelected())
        {
            scrollToElementJS(sportsCheckBox);
            clickElementJS(sportsCheckBox);
        }
    }
    public void UnClickReadingCheckBox()
    {
        if(find(readingCheckBox).isSelected())
        {
            scrollToElementJS(readingCheckBox);
            clickElementJS(readingCheckBox);
        }
    }
    public void UnClickMusicCheckBox()
    {
        if(find(musicCheckBox).isSelected())
        {
            scrollToElementJS(musicCheckBox);
            clickElementJS(musicCheckBox);
        }
    }
    // Check if the Checkbox is Clicked:
    public boolean IsSportsSelected()
    {
        return find(sportsCheckBox).isSelected();
    }
    public boolean IsReadingSelected()
    {
        return find(readingCheckBox).isSelected();
    }
    public boolean IsMusicSelected()
    {
        return find(musicCheckBox).isSelected();
    }

}
