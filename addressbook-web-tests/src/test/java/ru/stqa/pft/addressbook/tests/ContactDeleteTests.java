package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactDeleteTests extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    if(app.contact().all().size()==0){
      app.contact().create(new ContactData().withFirstname("name").withLastname("name2").withMobile("89231260083").withEmail("test@mail.ru"));
    }
  }
  @Test
  public void testContactDelete (){
    Set<ContactData> before =app.contact().all();
    ContactData deletedContact = before.iterator().next();
    app.contact().delete(deletedContact);
    Set <ContactData> after =app.contact().all();
    Assert.assertEquals(after.size(),before.size() -1);

    before.remove(deletedContact);
    Assert.assertEquals(before, after);


  }


}
