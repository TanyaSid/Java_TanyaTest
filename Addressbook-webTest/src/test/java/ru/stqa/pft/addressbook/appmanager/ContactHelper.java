package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by trodzina on 9/30/2016.
 */
public class ContactHelper extends HelperBase{


  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void populateContactPrData(ContactData contactData) {

    type(By.name("firstname"),contactData.getFisrtName());
    type(By.name("lastname"),contactData.getLastName());
    type(By.name("nickname"),contactData.getNickname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    type(By.name("email"),contactData.getEmail());



    if (!wd.findElement(By.xpath(contactData.getXpathBirthDay())).isSelected()) {
      click(By.xpath(contactData.getXpathBirthDay()));
    }
    if (!wd.findElement(By.xpath(contactData.getXpathBirthMonth())).isSelected()) {
      click(By.xpath(contactData.getXpathBirthMonth()));
    }

    type(By.name("byear"),contactData.getBirthYear());

    if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[2]")).isSelected()) {
      click(By.xpath("//div[@id='content']/form/select[5]//option[2]"));
    }
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void returntoHomepage() {
    click(By.linkText("home"));
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


}