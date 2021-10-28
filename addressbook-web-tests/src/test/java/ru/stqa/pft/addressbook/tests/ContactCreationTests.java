package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);
  }
}