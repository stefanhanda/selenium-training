package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPracticePage extends FormsPage
{
    // Forms Page RadioButtons:
    private final By maleRadioButton =    By.id("gender-radio-1");
    private final By femaleRadioButton =  By.id("gender-radio-2");
    private final By otherRadioButton =   By.id("gender-radio-3");

    // Forms Page Checkboxes:
    private final By sportsCheckBox =     By.id("hobbies-checkbox-1");
    private final By readingCheckBox =    By.id("hobbies-checkbox-2");
    private final By musicCheckBox =      By.id("hobbies-checkbox-3");

    // FormsPage Submit and Cancel Button
    private final By submitButton = By.id("submit");
    private final By closeSubmitPanelButton = By.id("closeLargeModal");

    // FormsPage Text Input Fields
    private final By firstNameField = By.id("firstName");
    private final By lastNameField = By.id("lastName");
    private final By emailField = By.id("userEmail");
    private final By phoneNumberField = By.id("userNumber");

    // Radio Button Click Methods:
    public void clickMaleRadioButton()
    {
        scrollToElementJS(maleRadioButton);
        clickElementJS(maleRadioButton);
    }
    public void clickFemaleRadioButton()
    {
        scrollToElementJS(femaleRadioButton);
        clickElementJS(femaleRadioButton);
    }
    public void clickOtherButton()
    {
        scrollToElementJS(otherRadioButton);
        clickElementJS(otherRadioButton);
    }

    // Radio Button Click Checks:
    public boolean isMaleRadioButtonClicked()
    {
        return find(maleRadioButton).isSelected();
    }
    public boolean isFemaleRadioButtonClicked()
    {
        return find(femaleRadioButton).isSelected();
    }
    public boolean isOtherRadioButtonClicked()
    {
        return find(otherRadioButton).isSelected();
    }

    // CheckBox Click Methods:
    public void clickSportsCheckBox()
    {
        if(!find(sportsCheckBox).isSelected())
        {
            scrollToElementJS(sportsCheckBox);
            clickElementJS(sportsCheckBox);
        }
    }
    public void clickReadingCheckBox()
    {
        if(!find(readingCheckBox).isSelected())
        {
            scrollToElementJS(readingCheckBox);
            clickElementJS(readingCheckBox);
        }
    }
    public void clickMusicCheckBox()
    {
        if(!find(musicCheckBox).isSelected())
        {
            scrollToElementJS(musicCheckBox);
            clickElementJS(musicCheckBox);
        }
    }
    // CheckBox UN-Click Methods:
    public void unClickSportsCheckBox()
    {
        if(find(sportsCheckBox).isSelected())
        {
            scrollToElementJS(sportsCheckBox);
            clickElementJS(sportsCheckBox);
        }
    }
    public void unClickReadingCheckBox()
    {
        if(find(readingCheckBox).isSelected())
        {
            scrollToElementJS(readingCheckBox);
            clickElementJS(readingCheckBox);
        }
    }
    public void unClickMusicCheckBox()
    {
        if(find(musicCheckBox).isSelected())
        {
            scrollToElementJS(musicCheckBox);
            clickElementJS(musicCheckBox);
        }
    }
    // Check if the Checkbox is Clicked:
    public boolean isSportsSelected()
    {
        return find(sportsCheckBox).isSelected();
    }
    public boolean isReadingSelected()
    {
        return find(readingCheckBox).isSelected();
    }
    public boolean isMusicSelected()
    {
        return find(musicCheckBox).isSelected();
    }

    // Submit Button Click
    public void clickSubmitButton()
    {
        scrollToElementJS(submitButton);
        clickElementJS(submitButton);
        //click(submitButton);
    }
    public void clickCloseSubmitPanelButton()
    {
        scrollToElementJS(closeSubmitPanelButton);
        clickElementJS(closeSubmitPanelButton);
    }
    public void fillFormsPageMandatoryFields(String firstName, String lastName, String email, String phoneNumber)
    {
        set(firstNameField,firstName);
        set(lastNameField,lastName);
        set(emailField,email);
        set(phoneNumberField,phoneNumber);
        clickMaleRadioButton();
    }
}
