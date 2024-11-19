package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsWebTablesPage extends ElementsPage
{
    private final By submitButton = By.id("submit");

    public void clickEditButton(String email)
    {
        By editButton = By.xpath("//div[text()='"+email+"']//following::span[@title='Edit']");

        scrollToElementJS(editButton);
        clickElementJS(editButton);
    }
    public void setFieldText(String fieldId, String inputText)
    {
        By field = By.id(fieldId);

        scrollToElementJS(field);
        set(field,inputText);
    }
    public void clickSubmitButton()
    {
        scrollToElementJS(submitButton);
        clickElementJS(submitButton);
    }
    public String getTableFirstNameField(String email)
    {
        By tableFirstNameField = By.xpath("//div[text()='"+ email +"']//preceding::div[3]");

        return find(tableFirstNameField).getText();
    }
    public String getTableLastNameField(String email)
    {
        By tableLastNameField = By.xpath("//div[text()='"+ email +"']//preceding::div[2]");

        return find(tableLastNameField).getText();
    }
    public String getTableAgeField(String email)
    {
        By tableAgeField = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");

        return find(tableAgeField).getText();
    }
    public String getTableSalaryField(String email)
    {
        By tableSalaryField = By.xpath("//div[text()='"+ email +"']//following::div[1]");

        return find(tableSalaryField).getText();
    }
    public String getTableDepartmentField(String email)
    {
        By tableDepartmentField = By.xpath("//div[text()='"+ email +"']//following::div[2]");

        return find(tableDepartmentField).getText();
    }
    public String getTableEmailField(String email)
    {
        By tableEmailField = By.xpath("//div[text()='"+ email +"']");

        return find(tableEmailField).getText();
    }
}
