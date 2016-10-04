package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {


    @Test
    public void testUserCreation()
    {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().populateContactPrData(new ContactData("First Name", "Last Name", "user by Tanya", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by", "1975", "//div[@id='content']/form/select[1]//option[17]", "//div[@id='content']/form/select[2]//option[7]"));
        app.getContactHelper().returntoHomepage();
    }


}
