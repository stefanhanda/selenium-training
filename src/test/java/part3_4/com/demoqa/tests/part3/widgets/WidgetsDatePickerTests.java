package part3_4.com.demoqa.tests.part3.widgets;

import com.demoqa.pages.widgets.WidgetDatePickerPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.DatePickerUtility.getMonthNumberAndCheckDay;

public class WidgetsDatePickerTests extends BaseTest
{
    @Test
    public void TestSelectDate()
    {
        //Test Input:
        String month = "July";
        String year = "2001";
        String day = "31";

        WidgetDatePickerPage datePicker = homePage.goToWidgets().clickDatePicker();

        datePicker.clickSelectDate();
        datePicker.selectMonth(month);
        datePicker.selectYear(year);
        datePicker.clickDay(day);

        //Transform month name to number string
        //If month doesn't have 31 days, but day selected is 31 ----> month -= 1
        month = getMonthNumberAndCheckDay(month,day);

        int num = Integer.parseInt(day);
        day = String.format("%02d", num);

        String actualDate = datePicker.getDate();
        String expectedDate = month + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate, "\nActual Date ("+ actualDate +") and Expected Date ("+ expectedDate +") - Do Not Match\n");
    }
}
