package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

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
    app.getNavigationHelper().returntoHomepage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().populateContactPrData(new ContactData("First Name_Edit", "Last Name Edit", "user by Tanya Edit",null, "title by Tanya Edit", "SS_1 ", "SS,SS,SS", "first-name.last-name@ss.by"),false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returntoHomepage();
  }
}
