package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by trodzina on 9/30/2016.
 */
public class ContactHelper extends HelperBase{




  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void populateContactPrData(ContactData contactData, boolean creation) {

    type(By.name("firstname"), contactData.getFisrtName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("email"), contactData.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    }
 else {
      Assert.assertFalse( isElementPresent(By.name("new_group")));
    }
    }


  public void initContactCreation() {
    click(By.linkText("add new"));
  }

public void confirmDeletion()
{
  wd.switchTo().alert().accept();

  }

  public void selectContact(int index) {

    WebElement checkbox = wd.findElements(By.name("selected[]")).get(index);

    // wd.findElements(By.name("selected[]"));
//    click(By.linkText("home"));
    if (!checkbox.isSelected()) {
     checkbox.click();

    }

  }

  public List<ContactData> getContactList() {
    List<ContactData>  contacts =new ArrayList<>();
    List<WebElement> elements = wd.findElements(By.xpath(".//*[@id='maintable']/tbody/tr[@name='entry']"));
    for(WebElement element:elements)
    {

      String lastName = element.findElement(By.xpath("./td[2]")).getText();
      String firstName = element.findElement(By.xpath("./td[3]")).getText();
      int id= Integer.parseInt(element.findElement(By.xpath("./td[1]")).findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(id,firstName, lastName, null, null, null, null,null, null);
      contacts.add(contact);
    }
    return contacts;
  }


  public void deleteContact() {
    wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
  }


  public void submitContactCreation()
  {
    wd.findElement(By.name("submit")).click();
  }


  public void submitContactModification()
  {
    wd.findElement(By.name("update")).click();
  }

  public void initContactModification() {

    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();

  }

  public int getGontactCount() {

    return wd.findElements(By.name("selected[]")).size();

  }

  public void contactCreation(ContactData contact,boolean contactPresence)
  {
    initContactCreation();
    populateContactPrData(contact,contactPresence);
    submitContactCreation();
  }


  public boolean isThereContact() {

    return isElementPresent(By.name("selected[]"));

  }

}