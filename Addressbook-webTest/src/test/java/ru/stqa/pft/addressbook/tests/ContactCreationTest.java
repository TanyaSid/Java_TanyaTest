package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase {


    @Test
    public void testUserCreation()
    {

        app.getNavigationHelper().returntoHomepage();
        List<ContactData> contbefore = app.getContactHelper().getContactList();

        ContactData contacts =new ContactData("First Name", "Last Name", "user by Tanya", "tanya test2", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by");
        app.getContactHelper().contactCreation(contacts,true);

        List<ContactData> contafter = app.getContactHelper().getContactList();

        Assert.assertEquals(contafter.size(),contbefore.size()+1);

        contacts.setId(contafter.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
        contbefore.add(contacts);
        Assert.assertEquals(new HashSet<Object>(contbefore),new HashSet<Object>(contafter));
        app.getNavigationHelper().returntoHomepage();
    }


}
