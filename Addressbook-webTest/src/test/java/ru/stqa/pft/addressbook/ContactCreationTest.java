package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class ContactCreationTest extends TestBase {


    @Test
    public void testUserCreation() {
        initContactCreation();
        popogateContactPrData(new ContactData("First Name", "Last Name", "user by Tanya", "title by Tanya", "SS ", "SS,SS,SS", "first-name.last-name@ss.by", "1975", "//div[@id='content']/form/select[1]//option[17]", "//div[@id='content']/form/select[2]//option[7]"));
        returntoHomepage();
    }


}
