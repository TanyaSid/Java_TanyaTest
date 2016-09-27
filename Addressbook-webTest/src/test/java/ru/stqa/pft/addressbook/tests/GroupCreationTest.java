package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation()
  {

    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("tanya test1", "test tanya2", "test tanya3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
