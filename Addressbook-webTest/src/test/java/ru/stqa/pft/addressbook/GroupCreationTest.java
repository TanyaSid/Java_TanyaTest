package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation()
  {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("tanya test1", "test tanya2", "test tanya3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
