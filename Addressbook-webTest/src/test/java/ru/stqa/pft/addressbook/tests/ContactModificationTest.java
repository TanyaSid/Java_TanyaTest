package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by trodzina on 11/1/2016.
 */
public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().returntoHomepage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().populateContactPrData(new ContactData("First Name_Edit", "Last Name Edit", "user by Tanya Edit", "title by Tanya Edit", "SS_1 ", "SS,SS,SS", "first-name.last-name@ss.by",null),false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returntoHomepage();
  }
}
