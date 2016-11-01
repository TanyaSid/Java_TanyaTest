package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreationTest extends TestBase {


    @Test
    public void testUserCreation()
    {

        app.getNavigationHelper().returntoHomepage();
        app.getContactHelper().contactCreation(new ContactData("First Name", "Last Name", "user by Tanya", "tanya test1", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by"),true);
        app.getNavigationHelper().returntoHomepage();
    }


}
