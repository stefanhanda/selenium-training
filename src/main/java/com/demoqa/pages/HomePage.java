package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows.AlertsFramesWindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;
import com.base.BasePage;
import com.demoqa.pages.forms.FormsPage;

import static utilities.JavaScriptUtility.clickElementJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage
{
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private final By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private final By alertsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");

    public FormsPage goToForms()
    {
        scrollToElementJS(formsCard);
        clickElementJS(formsCard);
        return new FormsPage();
    }
    public ElementsPage goToElements()
    {
        scrollToElementJS(elementsCard);
        clickElementJS(elementsCard);
        return new ElementsPage();
    }
    public WidgetsPage goToWidgets()
    {
        scrollToElementJS(widgetsCard);
        clickElementJS(widgetsCard);
        return new WidgetsPage();
    }
    public AlertsFramesWindowsPage goToAlerts()
    {
        scrollToElementJS(alertsCard);
        clickElementJS(alertsCard);
        return new AlertsFramesWindowsPage();
    }
}
