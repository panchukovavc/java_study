package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase{
  @Test
  public void testContactModification(){
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    }
    List<ContactData> before =app.getContactHelper().getContactList();
    app.getNavigationHelper().initContactModification(before.size()-1);
    app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "2256", "mgd@mail.ru"));
    app.getNavigationHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
    List <ContactData> after =app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size());

  }
}
