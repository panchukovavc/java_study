package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactModificationTests extends TestBase{
  @BeforeMethod
  public void ensurePreconditions () {
    if(app.contact().all().size()==0){
      app.contact().create(new ContactData().withFirstname("name").withLastname("name2").withMobile("89231260083").withEmail("test@mail.ru"));
    }
  }

  @Test
  public void testContactModification(){
    Set<ContactData> before =app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData()
            .withId(modifiedContact.getId()).withFirstname("test1").withLastname("test2").withMobile("2256").withEmail("mgm@mail.ru");
    app.contact().modify(contact);
    Set <ContactData> after =app.contact().all();
    Assert.assertEquals(after.size(),before.size());

    before.remove(modifiedContact);
    before.add(contact);
    Assert.assertEquals(before, after);

  }


}
