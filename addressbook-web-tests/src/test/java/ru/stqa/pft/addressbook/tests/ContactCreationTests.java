package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    List<ContactData> before =app.getContactHelper().getContactList();
    app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    List <ContactData> after =app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() +1);
  }
}