package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

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

  public void selectContact() {

    if (!wd.findElement(By.id("3")).isSelected()) {
      click(By.id("3"));
    }
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


}