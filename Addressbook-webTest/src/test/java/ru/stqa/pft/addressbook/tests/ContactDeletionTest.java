package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

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
      app.getContactHelper().contactCreation(new ContactData("First Name", "Last Name", "user by Tanya", "tanya test1", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by"),true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmDeletion();
    app.getNavigationHelper().returntoHomepage();


  }
}
