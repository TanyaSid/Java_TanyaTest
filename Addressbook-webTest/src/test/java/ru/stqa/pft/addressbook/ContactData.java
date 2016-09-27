package ru.stqa.pft.addressbook;

public class ContactData {
  private final String fisrtName;
  private final String lastName;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String email;
  private final String birthYear;
  private final String xpathBirthDay;
  private final String xpathBirthMonth;

  public ContactData(String fisrtName, String lastName, String nickname, String title, String company, String address, String email, String birthYear, String xpathBirthDay, String xpathBirthMonth) {
    this.fisrtName = fisrtName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.email = email;
    this.birthYear = birthYear;
    this.xpathBirthDay = xpathBirthDay;
    this.xpathBirthMonth = xpathBirthMonth;
  }

  public String getFisrtName() {
    return fisrtName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public String getXpathBirthDay() {
    return xpathBirthDay;
  }

  public String getXpathBirthMonth() {
    return xpathBirthMonth;
  }
}
