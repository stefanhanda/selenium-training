package part3_4.com.demoqa.tests.part3.elements;

import com.demoqa.pages.elements.ElementsWebTablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ElementsWebTableTests extends BaseTest
{
    @Test
    public void TestEditAgeFieldWebTable()
    {
        String inputEmail = "kierra@example.com";
        String inputAge = "69";
        ElementsWebTablesPage elementsWebTablesPage = homePage.goToElements().clickWebTablesMenuItem();

        elementsWebTablesPage.clickEditButton(inputEmail);
        elementsWebTablesPage.setFieldText("age",inputAge);
        elementsWebTablesPage.clickSubmitButton();

        String actualAge = elementsWebTablesPage.getTableAgeField(inputEmail);

        Assert.assertEquals(actualAge, inputAge, "\n Actual and Expected Ages do not match! \n");
    }
    @Test
    public void TestEditAllFieldsWebTable()
    {
        String inputEmail = "cierra@example.com";
        String newInputEmail = "testEmail@example.com";
        String inputFName = "TestFirstName";
        String inputLName = "TestLastName";
        String inputAge = "69";
        String inputSalary = "12345";
        String inputDepartment = "TestDepartment";

        ElementsWebTablesPage elementsWebTablesPage = homePage.goToElements().clickWebTablesMenuItem();

        elementsWebTablesPage.clickEditButton(inputEmail);
        elementsWebTablesPage.setFieldText("firstName",inputFName);
        elementsWebTablesPage.setFieldText("lastName",inputLName);
        elementsWebTablesPage.setFieldText("userEmail",newInputEmail);
        elementsWebTablesPage.setFieldText("age",inputAge);
        elementsWebTablesPage.setFieldText("salary",inputSalary);
        elementsWebTablesPage.setFieldText("department",inputDepartment);

        elementsWebTablesPage.clickSubmitButton();

        inputEmail = newInputEmail;

        String actualFirstName = elementsWebTablesPage.getTableFirstNameField(inputEmail);
        String actualLastName = elementsWebTablesPage.getTableLastNameField(inputEmail);
        String actualAge = elementsWebTablesPage.getTableAgeField(inputEmail);
        String actualEmail = elementsWebTablesPage.getTableEmailField(inputEmail);
        String actualSalary = elementsWebTablesPage.getTableSalaryField(inputEmail);
        String actualDepartment = elementsWebTablesPage.getTableDepartmentField(inputEmail);

        Assert.assertEquals(actualFirstName,inputFName, "\nActual and Expected First Names does not match!\n");
        Assert.assertEquals(actualLastName,inputLName, "\nActual and Expected Last Names does not match!\n");
        Assert.assertEquals(actualAge,inputAge, "\nActual and Expected Age does not match!\n");
        Assert.assertEquals(actualEmail,inputEmail, "\nActual and Expected Email does not match!\n");
        Assert.assertEquals(actualSalary,inputSalary, "\nActual and Expected Salary does not match!\n");
        Assert.assertEquals(actualDepartment,inputDepartment, "\nActual and Expected Department do not match!\n");
    }
}
