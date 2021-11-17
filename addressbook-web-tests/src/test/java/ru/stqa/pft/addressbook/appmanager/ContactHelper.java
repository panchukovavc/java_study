package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class ContactHelper extends HelperBase {

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
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("email"), contactData.getEmail());
  }

  public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void create(ContactData contact) {
    gotoAddNewPage();
    fillContactForm(contact);
    submitContactCreation();
    returnToContactPage();
  }

  public void modify(ContactData contact) {
    app.goTo().initContactModificationById(contact.getId());
    fillContactForm(contact);
    app.goTo().submitContactModification();
    returnToContactPage();
  }

  public void delete(ContactData contact) {
    app.goTo().selectContactById(contact.getId());
    app.goTo().deleteSelectContact();
    app.goTo().closeAlert();
    app.goTo().gotoHomePage();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public Set<ContactData> all() {
    Set<ContactData> contacts = new HashSet<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
    for (WebElement element : elements) {
      List<WebElement> cells = element.findElements(By.tagName("td"));
      int lastNameNum = 1;
      int firstNameNum = 2;
      String lastname = cells.get(lastNameNum).getText();
      String firstname = cells.get(firstNameNum).getText();
      int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      contacts.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname));
    }
    return contacts;
  }


}
