package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Created by trodzina on 10/4/2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void GroupModification()
  {

    app.getNavigationHelper().goToGroupPage();

    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().initGroupModification();
    GroupData group =new GroupData(before.get(before.size()-1).getId(),"test1 Tanya", "test tanya21", "test tanya31");
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size());

   before.remove(before.size()-1);
    before.add(group);
    Comparator<? super GroupData> byid= (g1,g2)->Integer.compare(g1.getId(),g2.getId()) ;
    before.sort(byid);
    after.sort(byid);
    Assert.assertEquals(before,after);

  }
}
