package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    Set<ContactData> before =app.contact().all();
    ContactData contact = new ContactData().withFirstname("name").withLastname("name2").withMobile ("89231260083").withEmail("test@mail.ru");
    app.contact().create(contact);
    Set <ContactData> after =app.contact().all();
    Assert.assertEquals(after.size(),before.size() +1);

    contact.withId(after.stream().mapToInt((c) ->c.getId()).max().getAsInt());
    before.add(contact);
    Assert.assertEquals(before,after);
  }
}