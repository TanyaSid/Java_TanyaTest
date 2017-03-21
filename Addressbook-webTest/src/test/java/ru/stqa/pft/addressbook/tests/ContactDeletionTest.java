package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Created by trodzina on 10/4/2016.
 */
public class ContactDeletionTest extends TestBase {

  @Test
  public void ContactDeletion()
  {
    app.getNavigationHelper().returntoHomepage();

    if(!app.getContactHelper().isThereContact())
    {
      app.getContactHelper().contactCreation(new ContactData("First Name", "Last Name", "user by Tanya", "tanya test2", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by"),true);
    }
    List<ContactData> contbefore = app.getContactHelper().getContactList();

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();

    app.getContactHelper().confirmDeletion();
    app.getNavigationHelper().returntoHomepage();

    List<ContactData> contafter = app.getContactHelper().getContactList();

    Assert.assertEquals(contafter.size(),contbefore.size()-1);
    contbefore.remove(contbefore.size()-1);

    Assert.assertEquals(contbefore,contafter);





  }
}
