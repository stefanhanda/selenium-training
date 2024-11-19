package part3_4.com.demoqa.tests.part3.widgets;

import com.demoqa.pages.widgets.WidgetsSelectMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class WidgetsSelectMenuTests extends BaseTest {
    @Test
    public void TestSelectMenuMultiSelect() {
        WidgetsSelectMenuPage selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("opel");

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Saab"));
        Assert.assertFalse(actualSelectedOptions.contains("Opel"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
