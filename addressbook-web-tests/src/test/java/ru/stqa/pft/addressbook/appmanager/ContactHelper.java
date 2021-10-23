package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
 private WebDriver wd;

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToContactPage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getFirstname() );
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("mobile"),contactData.getMobile());
    type(By.name("email"),contactData.getEmail());
  }

  public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void createContact(ContactData contact) {
    gotoAddNewPage();
    fillContactForm(contact);
    submitContactCreation();
    returnToContactPage();

  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));

  }
}
