package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeleteTests extends TestBase {
  @BeforeMethod
  public void ensurePreconditions () {
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("name", "name2", "89231260083", "test@mail.ru"));
    }
  }
  @Test
  public void testContactDelete (){
    List<ContactData> before =app.getContactHelper().getContactList();
    app.goTo().selectContact(before.size()-1);
    app.goTo().deleteSelectContact();
    app.goTo().closeAlert();
    app.goTo().gotoHomePage();
    List <ContactData> after =app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() -1);

    before.remove(before.size()-1);
    Assert.assertEquals(before, after);


  }
}
