package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by trodzina on 10/4/2016.
 */
public class ContactDeletionTest extends TestBase {

  @Test
  public void ContactDeletion()
  {

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmDeletion();


  }
}
