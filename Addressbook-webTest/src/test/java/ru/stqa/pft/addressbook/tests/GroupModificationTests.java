package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by trodzina on 10/4/2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void GroupModification()
  {

    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("tanya test11", "test tanya21", "test tanya31"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();


  }
}
