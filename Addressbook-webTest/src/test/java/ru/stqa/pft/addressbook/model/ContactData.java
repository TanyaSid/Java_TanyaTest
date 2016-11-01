package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String fisrtName;
  private final String lastName;
  private final String nickname;
  private String group;
  private final String title;
  private final String company;
  private final String address;
  private final String email;


  public ContactData(String fisrtName, String lastName, String nickname, String group, String title, String company, String address, String email) {
    this.fisrtName = fisrtName;
    this.lastName = lastName;
    this.nickname = nickname;
        this.title = title;
    this.company = company;
    this.address = address;
    this.email = email;
    this.group = group;
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

  public String getGroup() {
    return group;
  }


}
