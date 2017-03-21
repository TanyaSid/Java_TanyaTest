package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id;
  private final String fisrtName;
  private final String lastName;
  private final String nickname;
  private String group;
  private final String title;
  private final String company;
  private final String address;
  private final String email;


  public ContactData(int id, String fisrtName, String lastName, String nickname, String group, String title, String company, String address, String email) {
    this.id = id;
    this.fisrtName = fisrtName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.email = email;
    this.group = group;
  }



  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", fisrtName='" + fisrtName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (fisrtName != null ? !fisrtName.equals(that.fisrtName) : that.fisrtName != null) return false;
    return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;

  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (fisrtName != null ? fisrtName.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }


  public ContactData(String fisrtName, String lastName, String nickname, String group, String title, String company, String address, String email) {

    this.id=Integer.MAX_VALUE;
    this.fisrtName = fisrtName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.email = email;
    this.group = group;
  }

  public int getId() { return id;  }

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


  public void setId(int id) {
    this.id = id;
  }
}
