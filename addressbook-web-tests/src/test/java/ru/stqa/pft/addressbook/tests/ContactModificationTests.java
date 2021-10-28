package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification(){
    int before = app.getContactHelper().getContactCount();
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    }
    app.getNavigationHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "2256", "mgd@mail.ru"));
    app.getNavigationHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);

  }
}
