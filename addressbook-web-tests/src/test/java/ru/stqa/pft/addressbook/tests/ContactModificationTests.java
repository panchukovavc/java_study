package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification(){
    app.getNavigationHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "2256", "mgd@mail.ru"));
    app.getNavigationHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();

  }
}
