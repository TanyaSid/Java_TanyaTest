package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by trodzina on 11/1/2016.
 */
public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().returntoHomepage();

   if(!app.getContactHelper().isThereContact())
   {
      app.getContactHelper().contactCreation(new ContactData("First Name", "Last Name", "user by Tanya", "tanya test1", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by"),true);
   }
    List<ContactData> contbefore = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(contbefore.size());
    app.getContactHelper().initContactModification();
    ContactData contact =new ContactData(contbefore.get(contbefore.size()-1).getId(),"First Name", "Last Name", "user by Tanya", "tanya test1", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by");
    app.getContactHelper().submitContactModification();

    List<ContactData> contafter = app.getContactHelper().getContactList();
    Assert.assertEquals(contafter.size(),contbefore.size());

    contbefore.remove(contbefore.size()-1);
    contbefore.add(contact);
    Comparator<? super ContactData> byid= (g1, g2)->Integer.compare(g1.getId(),g2.getId()) ;
    contbefore.sort(byid);
    contafter.sort(byid);
    Assert.assertEquals(contbefore,contafter);
    app.getNavigationHelper().returntoHomepage();

  }
}
