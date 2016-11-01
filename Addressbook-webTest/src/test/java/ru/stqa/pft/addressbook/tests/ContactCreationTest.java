package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {


    @Test
    public void testUserCreation()
    {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().populateContactPrData(new ContactData("First Name", "Last Name", "user by Tanya", "tanya test1", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by"),true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returntoHomepage();
    }


}
